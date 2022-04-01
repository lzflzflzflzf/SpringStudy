package com.example.demo.mappers;

import com.example.demo.POJO.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PeopleMapper {

    void insertperson();

    void deleteperson();

    void updateperson();

    People searchperson();

    List<People> searchAll();

    People getByName(String name);

}
