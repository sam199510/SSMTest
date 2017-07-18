package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by fei on 2017/7/18.
 */

//控制器类
@Controller
@RequestMapping("/")
public class SSMController {

    //将用户业务层类自动注入
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //定位到主页的方法
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView indexPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        //调用搜索所有用户的方法
        List<User> users = this.userService.getAllUser();
        modelAndView.addObject("users",users);

        return modelAndView;
    }

    //搜索所有用户的方法
    @RequestMapping(value = "showAllUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> showAllUser(){
        System.out.println("查询所有用户");
        //调用搜索所有用户的方法并以JSON的方式返回
        return userService.getAllUser();
    }
}
