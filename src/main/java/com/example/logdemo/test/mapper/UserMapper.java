package com.example.logdemo.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.logdemo.test.domain.User;

import java.util.List;

/**
* @author fengtx45968
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-01-18 10:53:25
* @Entity generator.domain.UserMapper
*/

public interface UserMapper extends BaseMapper<User> {
    List<User> selectAll();
}




