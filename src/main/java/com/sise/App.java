package com.sise;

import com.sise.bean.User;
import com.sise.mapper.UserMapper;
import com.sise.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class App {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private UserServiceImpl userService;
    @Test
    public void test() throws Exception{

     userService.save(new User(null,"",11,new Date(),""));
      // userService.listAll().forEach(System.out::println);
    }

}
