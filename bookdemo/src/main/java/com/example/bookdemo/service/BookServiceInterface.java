package com.example.bookdemo.service;



import com.example.bookdemo.pojo.Book;

import java.util.List;

public interface BookServiceInterface {

    //添加
    public Book addBook(Book k);
    //批量插入
    public int addSomeBook(List<Book> books);

    //删除
    public int deleteByName(String bookname);
    //批量删除
    public int deleteSomeBook(List<String> names);

    //修改
    public int UpdatePrice(String bookName, float newPrice);


    //查询全部
    public List<Book> queryAllBook();
    //按名查询
    public Book queryByName(String name);
}
