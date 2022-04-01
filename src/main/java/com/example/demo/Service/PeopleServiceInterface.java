package com.example.demo.Service;

import com.example.demo.POJO.People;

import java.util.List;

public interface PeopleServiceInterface {

    //查询
    public List<People> queryAll();
    //添加数据
    public int add(People p);
    //根据用户名查询数据
    public People queryByName(String username);
}
