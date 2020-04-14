package com.sise.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sise.bean.User;
import com.sise.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserServiceImpl implements IUserService{



    UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }



    @Override
    public void save(User user) {
        userMapper.insert(user);

    }

    @Override
    public void delete(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User get(Long id) {
        return userMapper.selectById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listAll() {
        return userMapper.selectAll();
    }


    @Override
    public PageInfo<User> findByPage(Integer pageNum, Integer pageSize) {

        if (pageNum == null){
            pageNum=1;
        }

        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> pageInfo=new PageInfo<>(users);
        return pageInfo;
    }



}
