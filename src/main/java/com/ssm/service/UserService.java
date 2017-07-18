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

}
