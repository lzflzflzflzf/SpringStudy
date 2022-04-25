package com.example.bookdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookHelloController {

    @RequestMapping("/hello")
    public String h()
    {
        return "hello book2";
    }
}
