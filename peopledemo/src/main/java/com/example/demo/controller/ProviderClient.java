package com.example.demo.controller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//
//import lombok.extern.apachecommons.CommonsLog;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "bookdemo")
@Component
public interface ProviderClient {

    @RequestMapping("/bookhelloworld")
    String hi();
}