package com.springcloud.controller;

import com.springcloud.entity.Stu;
import com.springcloud.entity.User;
import com.springcloud.service.StuService;
import com.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private StuService stuService;

    @PostMapping("/userInfo/{id}")
    public User test(@PathVariable("id") Integer id){
        return userInfoService.getUser(id);
    }

    @PostMapping("/test")
    public void test2(@RequestBody Stu stu) {
        // 插入stu数据
        stuService.create(stu);
        // 调用user服务插入user数据
        User user = new User();
        user.setAge(stu.getAge());
        userInfoService.create(user);
    }
}
