package com.practise.todos.todos.controller;

import com.practise.todos.todos.beans.HelloWorldBean;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/me")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld () {

        return "Hello World";
    };

    @GetMapping("/name/{name}")
    public  HelloWorldBean nameBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s", name));
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser() {
        return new ResponseEntity<>("{\"message\" : \"Successful\"}", HttpStatus.OK);
    }

};