package com.springcloud.service;

import com.springcloud.entity.Stu;
import com.springcloud.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuService {

    @Autowired
    private StuMapper stuMapper;

    public void create(Stu stu) {
        stuMapper.create(stu.getAge());
    }
}
