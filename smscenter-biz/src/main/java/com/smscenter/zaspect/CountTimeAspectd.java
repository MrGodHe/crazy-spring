package com.smscenter.zaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

/**
 * by wmengyu@yiji.com
 * com.yjf.gw.paymentgw.times
 *
 * @author hewei
 */
@Aspect
@Service("countTimeAspectd")
public class CountTimeAspectd {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
    @Pointcut("execution(* com.yjf.gw.paymentgw.framework.impl.onlinepay.cibwx..*(..))")
    public void invoke() {

    }
    @Around("invoke()")
    public Object countResposeTime(ProceedingJoinPoint pjp){

        //扫描注解
        org.aspectj.lang.Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        AspectedMethod aspectedMethod = targetMethod.getAnnotation(AspectedMethod.class);

        Object object = null;

        //参数获取
        Object[]  args= pjp.getArgs();
        if(args!=null && args.length>0){

            try {
                long reqTime  = System.currentTimeMillis();
                object = pjp.proceed();
                long rspTime  = System.currentTimeMillis();

                long cusTime = (rspTime-reqTime)/1000;


            } catch (Throwable e) {
              //被切面的方法内部异常自己处理完成，

            }

        }else{
            //未找到参数

        }
        return  object;

    }


}
