package com.smscenter.dal.mybatis;

import com.smscenter.dal.dao.UserDao;
import com.smscenter.dal.entity.UserDo;

import java.util.List;

/**
 * @author:Mr.he date: 2016/9/26
 * email:1182501678@qq.com
 */
public class MybatisUserDaoImpl extends BaseMybatis implements UserDao {
    @Override
    public List<UserDo> findAllUsers() {

        return getSqlSession().selectList("FIND-ALL-USERS");
    }
}
