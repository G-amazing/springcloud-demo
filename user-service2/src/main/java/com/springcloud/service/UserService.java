package com.springcloud.service;

import com.springcloud.entity.User;
import com.springcloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer id){
        return userMapper.getUser(id);
    }
}
