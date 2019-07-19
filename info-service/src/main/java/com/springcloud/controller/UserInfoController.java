package com.springcloud.controller;

import com.springcloud.entity.User;
import com.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/userInfo/{id}")
    public User test(@PathVariable("id") Integer id){
        return userInfoService.getUser(id);
    }
}
