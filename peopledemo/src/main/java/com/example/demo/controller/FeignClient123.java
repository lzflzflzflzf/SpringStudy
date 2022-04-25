package com.example.demo.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;
@FeignClient(value = "bookdemo")
@Component
public interface FeignClient123 {

    @RequestMapping(value="/bookhelloworld")
    String getMessage();
}
