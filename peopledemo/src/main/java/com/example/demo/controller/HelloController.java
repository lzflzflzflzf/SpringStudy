package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handler1()
    {
        return "hello springboot";
    }

    @Resource
    ProviderClient providerClient;


    @GetMapping(value = "/helloconsumer")
    public String h()
    {

        String result = providerClient.hi();
        return result;
    }

    @Resource
    private FeignClient123 feignClientService;

    @GetMapping("getMessage")
    public String getMessage(){
        return feignClientService.getMessage();
    }


}
