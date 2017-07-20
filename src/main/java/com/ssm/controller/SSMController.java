package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

        System.out.println("被调用");

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

    //检查用户名是否存在的方法
    @RequestMapping(value = "checkUserName", method = RequestMethod.POST)
    @ResponseBody
    public int checkUserName(String username){
        return this.userService.checkUserName(username).size();
    }

    //注册用户方法
    @RequestMapping(value = "registUser", method = RequestMethod.POST)
    public String registUser(User user){
        System.out.println(JSON.toJSONString(user));
        this.userService.registUser(user);
        return "redirect:index.html";
    }

    //注销用户方法
    @RequestMapping(value = "deleteUser", method = RequestMethod.GET)
    public String deleteUser(Integer id){
        System.out.println(id);
        this.userService.deleteUser(id);
        return "redirect:index.html";
    }

    //跳转到修改信息页面的方法
    @RequestMapping(value = "updateInfo", method = RequestMethod.GET)
    public ModelAndView updateInfoPage(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(id);
        modelAndView.setViewName("editUserInfo");
        User user = this.userService.getUserInfo(id);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    //修改用户信息的方法
    @RequestMapping(value = "updateInfo", method = RequestMethod.POST)
    public String updateInfo(User user){
        System.out.println(JSON.toJSONString(user));
        this.userService.updateInfo(user);
        return "redirect:index.html";
    }

    //跳转到修改密码页面的方法
    @RequestMapping(value = "updatePassword", method = RequestMethod.GET)
    public ModelAndView updatePasswordPage(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(id);
        modelAndView.setViewName("updatePassword");
        User user = this.userService.getUserInfo(id);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    //检查旧密码的方法
    @RequestMapping(value = "checkOldPassword", method = RequestMethod.POST)
    @ResponseBody
    public int checkOldPassword(Integer id, String oldPassword){
        System.out.println("检查旧密码的方法被调用");
        User user = new User();
        user.setId(id);
        user.setPassword(oldPassword);
        return this.userService.checkOldPassword(user).size();
    }

    //修改密码方法
    @RequestMapping(value = "updatePassword", method = RequestMethod.POST)
    public String updatePassword(Integer id, String password){
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        System.out.println("修改密码成功");
        this.userService.updateInfo(user);
        return "redirect:index.html";
    }

    //模糊搜素用户的方法
    @RequestMapping(value = "searchUser", method = RequestMethod.POST)
    public ModelAndView searchUser(String username){
        System.out.println("搜素用户方法北调用");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        User user = new User();
        user.setUsername("%" + username + "%");
        List<User> users = this.userService.selectByUserName(user);
        modelAndView.addObject("users",users);
        return modelAndView;
    }
}
