package com.example.logdemo.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.logdemo.test.domain.Todo;
import com.example.logdemo.test.mapper.TodoMapper;
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

    @Autowired
    private TodoMapper todoMapper;


    @RequestMapping("/getTodoList")
    List<Todo> getTodoList(Todo todo){
        log.info("getTodoList:{}", todo);
        List<Todo> todoList = todoService.list();
        log.info(String.valueOf(todoList));
        return todoList;
    }
}
