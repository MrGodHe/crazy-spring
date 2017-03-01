package com.smscenter.dal.dao;

import com.smscenter.dal.entity.UserDo;

import java.util.List;

/**
 * @author:Mr.he date: 2016/9/26
 * email:1182501678@qq.com
 */
public interface UserDao{

    public List<UserDo> findAllUsers();

}
