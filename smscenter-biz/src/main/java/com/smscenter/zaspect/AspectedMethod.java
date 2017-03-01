/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * zeyong 2014-9-17 下午11:36:00 创建
 */
package com.smscenter.zaspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义切面方法注解
 * by wmengyu@yiji.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AspectedMethod {
	
	String code() default "";
	
	String name() default "";
	
	AspectType[] aspectTypes() default { AspectType.TIME };
	
	/**
	 * 切面类型
	 * 
	 * @author zeyong
	 * 
	 */
	public static enum AspectType {
		TIME;
	}
}
