package com.springcloud.mapper;


import com.springcloud.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    User getUser(Integer id);

    User getUserLike(String name);

    User findUserByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    void create(Integer age);
}
