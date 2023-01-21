package com.example.logdemo.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.logdemo.test.domain.User;
import com.example.logdemo.test.service.UserService;
import com.example.logdemo.test.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author fengtx45968
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-01-18 10:53:25
*/
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




