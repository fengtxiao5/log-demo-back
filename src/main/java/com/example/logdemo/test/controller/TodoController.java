package com.example.logdemo.test.controller;

import com.example.logdemo.test.domain.Todo;
import com.example.logdemo.test.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
@Slf4j
public class TodoController {

    @Autowired
    private TodoService todoService;

//    @Autowired
//    private TodoMapper todoMapper;


    @RequestMapping("/getTodoList")
    List<Todo> ttt(Todo todo){
        log.info("getTodoList:{}", todo);
//        QueryWrapper<User> wrapper = new QueryWrapper();
//        wrapper.select("*");
//        List<User> list = userService.list(wrapper);
//        User ffeeng = userMapper.selectById("ffeeng");
        List<Todo> todoList = todoService.list();
        log.info(String.valueOf(todoList));
        return todoList;
    }
}
