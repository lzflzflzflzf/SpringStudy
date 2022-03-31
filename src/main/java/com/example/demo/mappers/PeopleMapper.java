package com.example.demo.mappers;

import com.example.demo.POJO.People;

import java.util.List;

public interface PeopleMapper {

    void insertperson();

    void deleteperson();

    void updateperson();

    People searchperson();

    List<People> searchAll();

    People getByName(String name);

}
