package com.springcloud.controller;

import com.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springcloud.service.UserService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id, HttpServletRequest request){
        System.out.println("当前服务端口："+request.getServerPort());
        return userService.getUser(id);
    }
}
