package com.example.demo.controller;

import com.example.demo.pojo.People;
import com.example.demo.service.PeopleServiceIImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {
    @Autowired
    PeopleServiceIImpl peopleService;


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
