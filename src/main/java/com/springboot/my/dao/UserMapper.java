package com.springboot.my.dao;

import com.springboot.my.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findById(Integer id);
}
