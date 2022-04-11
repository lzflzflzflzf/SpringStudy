package com.example.bookdemo.mappers;

import com.example.bookdemo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper {

    //添加
    void insert(@Param("book") Book b);
    //批量插入
    int insertMore(@Param("books") List<Book> books);

    //删除
    int delete(@Param("book") String b);
    //批量删除
    int deleteMore(@Param("books") List<String> books);

    //修改
    int update(@Param("bookname") String name, @Param("newprice") float price);

    //查询全部
    List<Book> queryAll();

    //按名查询
    Book queryBook(@Param("name") String name);

}
