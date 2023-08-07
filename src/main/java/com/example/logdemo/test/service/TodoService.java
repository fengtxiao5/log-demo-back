package com.example.logdemo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.logdemo.test.domain.Todo;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【todo】的数据库操作Service
* @createDate 2023-08-03 23:07:55
*/
@Mapper
public interface TodoService extends IService<Todo> {
    public void printMethod();
}
