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

    public User getUserLike(String name) {
        return userMapper.getUserLike(name);
    }

    public Boolean findUserByUserNameAndPassword(String username, String password) {
        User user = userMapper.findUserByUserNameAndPassword(username, password);
        if (user == null){
            return false;
        }
        return true;
    }
}
