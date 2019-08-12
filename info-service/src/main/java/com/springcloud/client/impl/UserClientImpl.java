package com.springcloud.client.impl;

import com.springcloud.client.UserClient;
import com.springcloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient{
    @Override
    public User getUser(Integer id) {
        System.out.println("调用了熔断器类UserClientImpl");
        User user = new User();
        user.setName("服务器内部错误");
        return user;
    }

    @Override
    public void create(User user) {

    }
}
