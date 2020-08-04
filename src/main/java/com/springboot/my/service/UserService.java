package com.springboot.my.service;

import com.springboot.my.dao.UserMapper;
import com.springboot.my.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
