package com.example.demo.Controller;

import com.example.demo.POJO.People;
import com.example.demo.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<People> findAllPeople()
    {
        List<People> people = peopleService.queryAll();

        return people;
    }

    @RequestMapping("/findPerson")
    @ResponseBody
    public People findByname(String name)
    {

        return peopleService.queryByName("lzf");
    }


}
