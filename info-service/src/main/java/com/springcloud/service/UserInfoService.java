package com.springcloud.service;

import com.springcloud.client.UserClient;
import com.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserClient userClient;

    public User getUser(Integer id) {
        return userClient.getUser(id);
    }
}
