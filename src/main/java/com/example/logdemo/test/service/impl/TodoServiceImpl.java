package com.example.logdemo.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.logdemo.test.domain.Todo;
import com.example.logdemo.test.service.TodoService;
import com.example.logdemo.test.mapper.TodoMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【todo】的数据库操作Service实现
* @createDate 2023-08-03 23:07:55
*/
@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo>
    implements TodoService {

    public void printMethod() {
        System.out.println("执行了");
    }

}




