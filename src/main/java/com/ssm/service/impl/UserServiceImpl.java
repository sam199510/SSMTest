package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fei on 2017/7/18.
 */

//用户业务层接口类的实现类
@Service
@Transactional
public class UserServiceImpl implements UserService {

    //将userMapper自动注入到业务成是实现类中
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //搜索所有用户方法
    public List<User> getAllUser(){
        //调用userMapper中搜索所有用户的方法
        return this.userMapper.selectAllUser();
    }
}
