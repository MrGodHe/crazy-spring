package com.smscenter.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:Mr.he date: 2017/2/3
 * email:1182501678@qq.com
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hii")
    public String test(){
        System.out.println("======>进入了服务");
        return "index";
    }

    @RequestMapping("/say")
    public @ResponseBody String say(){
        logger.info("===========记录java 日志组建");
        String s = "{\"name\":\"测试返回String\"}";
        System.out.println(s);
        return "何伟";
    }
}
