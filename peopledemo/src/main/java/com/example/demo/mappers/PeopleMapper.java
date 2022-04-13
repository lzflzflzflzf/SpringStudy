package com.example.demo.mappers;

import com.example.demo.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PeopleMapper {

    //插入一个people
    void insertperson();

    //删除一个people
    void deleteperson();

    //更新一个people
    void updateperson();

    //查找一个people
    People searchperson();

    //查找所有people，返回list
    List<People> searchAll();

    //按人员名称查找
    People getByName(String name);

}
