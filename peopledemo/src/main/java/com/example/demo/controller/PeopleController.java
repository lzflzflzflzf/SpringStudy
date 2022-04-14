package com.example.demo.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.bookdemo.pojo.Book;
import com.example.bookdemo.service.BookServiceImpl;
import com.example.demo.pojo.People;
import com.example.demo.service.PeopleServiceIImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {
    @Autowired
    PeopleServiceIImpl peopleService;

    @Autowired
    BookServiceImpl bookService;

    @RequestMapping("/usebook/getbook")
    public String getAllBook()
    {
        List<Book> books = bookService.queryAllBook();
        StringBuilder sb = new StringBuilder();
        books.forEach(b->{
            sb.append(b.toString());
            sb.append("\n");
            System.out.println(b.toString());
        });
        return sb.toString();
    }


    @RequestMapping("/hellomodule")
    public String he()
    {
        return "hello multi-module";
    }



    @NacosValue(value = "${name}", autoRefreshed = true)
    private String name;

    @NacosValue(value = "${password}", autoRefreshed = true)
    private String password;

    @RequestMapping("/getConfig")
    public String getConfig()
    {
        return name+"  "+password;
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<People> findAllPeople()
    {
        List<People> people = peopleService.queryAll();

        return people;
    }

    @RequestMapping(value = "/findPerson", method = RequestMethod.GET)
    public People findByname(String name)
    {

        return peopleService.queryByName("lzf");
    }


}
