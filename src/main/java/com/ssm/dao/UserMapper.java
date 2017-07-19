package com.ssm.dao;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//用户Mapper的数据持久化类
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //搜索所有用户的方法，在UserMapper.xml中可以找到
    List<User> selectAllUser();

    //检查用户名是否存在的方法
    List<User> checkUserName(String username);

    //检查旧密码是否正确的方法
    List<User> checkOldPassword(User user);

    //模糊查询用户
    List<User> selectByUserName(User user);
}