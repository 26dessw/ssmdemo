package com.sise.mapper;

import com.sise.bean.User;

import java.util.List;


//需要有对应的mapper文件
public interface UserMapper {


    int insert(User user);

    int updateById(User user);

    int deleteById(Long id);

    User selectById(Long id);

    List<User> selectAll();
}
