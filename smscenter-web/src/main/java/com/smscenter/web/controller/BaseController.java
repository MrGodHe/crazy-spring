package com.smscenter.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:Mr.he date: 2017/2/3
 * email:1182501678@qq.com
 */
@Controller
public class BaseController {
    @RequestMapping("/hi")
    public String test(){
        System.out.println("======>进入了服务");
        return "index";
    }

}
