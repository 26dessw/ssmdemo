package com.sise.service;

import com.github.pagehelper.PageInfo;
import com.sise.bean.User;

import java.util.List;

public interface IUserService {
    void save(User user);
    void delete(Long id);
    void update(User user);

    User get(Long id);
    List<User> listAll();

    PageInfo<User> findByPage(Integer pageNum, Integer pageSize);


}
