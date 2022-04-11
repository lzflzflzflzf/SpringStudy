package com.example.demo.service;

import com.example.demo.pojo.People;
import com.example.demo.mappers.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceIImpl implements PeopleServiceInterface{

    @Autowired
    PeopleMapper peopleMapper;

    @Override
    public List<People> queryAll() {
        return peopleMapper.searchAll();
    }

    @Override
    public int add(People p) {
        return 2;
//        return peopleMapper.insertperson();
    }

    @Override
    public People queryByName(String username) {
        return peopleMapper.getByName(username);
    }
}
