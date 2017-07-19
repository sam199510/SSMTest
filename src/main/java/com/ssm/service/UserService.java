package com.ssm.service;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fei on 2017/7/18.
 */

//用户业务层接口类
@Repository
public interface UserService {

    //搜索所有用户方法
    List<User> getAllUser();

    //检查用户名是否存在的方法
    List<User> checkUserName(String username);

    //注册用户方法
    void registUser(User user);

    //删除用户方法
    void deleteUser(Integer userId);

}
