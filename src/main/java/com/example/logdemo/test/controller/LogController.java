package com.example.logdemo.test.controller;

import com.example.logdemo.test.domain.User;
import com.example.logdemo.test.mapper.UserMapper;
import com.example.logdemo.test.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/onetest")
    List<User> ttt(){
        logger.info("aaa");
//        QueryWrapper<User> wrapper = new QueryWrapper();
//        wrapper.select("*");
//        List<User> list = userService.list(wrapper);
//        User ffeeng = userMapper.selectById("ffeeng");
        List<User> userList = userMapper.selectAll();
        logger.info(String.valueOf(userList));
        return userList;
    }
}
