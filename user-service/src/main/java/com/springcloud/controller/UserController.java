package com.springcloud.controller;

import com.springcloud.entity.User;
import com.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Integer id, HttpServletRequest request){
        System.out.println("当前服务端口："+request.getServerPort());
        return userService.getUser(id);
    }

    @PostMapping("/userLike")
    @ResponseBody
    public User userLike(@RequestParam String name, HttpServletRequest request){
        System.out.println(name);
        return userService.getUserLike(name);
    }

    @PostMapping("/user/login")
    public String login(@RequestParam("userName") String username, @RequestParam("password") String password){
        Boolean flag = userService.findUserByUserNameAndPassword(username, password);
        if (flag){
            return "index";
        }
        return "login-error";
    }

}
