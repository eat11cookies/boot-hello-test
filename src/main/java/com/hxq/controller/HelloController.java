package com.hxq.controller;

import com.hxq.service.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Helloservice helloservice;
    @GetMapping("/hello")
    public String sayHello() {
        String s = helloservice.sayHello("张三");
        return s;
    }
}
