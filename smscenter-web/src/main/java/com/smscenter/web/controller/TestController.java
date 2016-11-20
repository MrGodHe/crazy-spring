package com.smscenter.web.controller;

import com.smscenter.dal.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author:Mr.he date: 2016/9/25
 * email:1182501678@qq.com
 */
@Controller
public class TestController {

    @Resource
    private UserDao userDao;

    @RequestMapping("/index.do")
    public String jumpPage(){

        System.out.println("----进入controller！");
        System.out.println( userDao.findAllUsers());

        return "WEB-INF/index.html";
    }
}
