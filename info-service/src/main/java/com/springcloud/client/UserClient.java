package com.springcloud.client;

import com.springcloud.client.impl.UserClientImpl;
import com.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "user-service",fallback = UserClientImpl.class)
public interface UserClient {

    @PostMapping("/user/{id}")
    User getUser(@PathVariable("id") Integer id);

}
