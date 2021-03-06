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
    @Override
    public List<User> getAllUser(){
        //调用userMapper中搜索所有用户的方法
        return this.userMapper.selectAllUser();
    }

    //检查用户名是否存在的方法
    @Override
    public List<User> checkUserName(String username){
        return this.userMapper.checkUserName(username);
    }

    //注册用户方法
    @Override
    public void registUser(User user) {
        this.userMapper.insert(user);
    }

    //删除用户方法
    @Override
    public void deleteUser(Integer userId) {
        this.userMapper.deleteByPrimaryKey(userId);
    }

    //获取单个用户信息的方法
    @Override
    public User getUserInfo(Integer userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    //修改用户信息的方法
    @Override
    public void updateInfo(User user) {
        this.userMapper.updateByPrimaryKeySelective(user);
    }

    //检查旧密码的方法
    @Override
    public List<User> checkOldPassword(User user) {
        return this.userMapper.checkOldPassword(user);
    }

    //模糊查询用户方法
    @Override
    public List<User> selectByUserName(User user) {
        return this.userMapper.selectByUserName(user);
    }
}
