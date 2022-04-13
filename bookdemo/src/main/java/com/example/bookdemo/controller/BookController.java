package com.example.bookdemo.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.bookdemo.pojo.Book;
import com.example.bookdemo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookServiceImpl bookService;





    @NacosValue(value = "${bookname}", autoRefreshed = true)
    private String name;

    @NacosValue(value = "${bookid}", autoRefreshed = true)
    private String id;

    @RequestMapping("/getConfig")
    public String getConfig()
    {
        return name+"  "+id;
    }






    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Book insertbook()
    {
        return bookService.addBook(new Book("python199", ((float) 39.5)));
    }


    @RequestMapping(value = "/addmore", method = RequestMethod.POST)
    public void insertMore()
    {
        List<Book> lists = new ArrayList<>();
        lists.add(new Book("a", ((float) 39.1)));
        lists.add(new Book("b", ((float) 39.2)));
        lists.add(new Book("c", ((float) 39.3)));
        int res = bookService.addSomeBook(lists);
        System.out.println(res);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete()
    {
        int res = bookService.deleteByName("java");
        System.out.println(res);
    }

    @RequestMapping(value = "/deletemore", method = RequestMethod.DELETE)
    public void deleteMore()
    {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        int res = bookService.deleteSomeBook(names);
        System.out.println(res);
    }

    @RequestMapping(value = "/updateprice" , method = RequestMethod.PUT)
    public void updatePrice()
    {
        int res = bookService.UpdatePrice("java" , ((float) 99.99));
        System.out.println(res);
    }

    @RequestMapping(value = "/queryall" , method = RequestMethod.GET)
    public void queryAll()
    {
        List<Book> books = bookService.queryAllBook();
        System.out.println(books);
    }

    @RequestMapping(value = "/query" , method = RequestMethod.GET)
    public Book getByName()
    {
        Book book = bookService.queryByName("python");
        System.out.println(book);
        return book;
    }

}
