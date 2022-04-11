package com.example.bookdemo.service;


import com.example.bookdemo.mappers.BookMapper;
import com.example.bookdemo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookServiceInterface{

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book addBook(Book b) {
        bookMapper.insert(b);
        return b;
    }

    @Override
    public int addSomeBook(List<Book> books) {
        return bookMapper.insertMore(books);
    }

    @Override
    public int deleteByName(String bookname) {
        return bookMapper.delete(bookname);
    }

    @Override
    public int deleteSomeBook(List<String> names) {
        return bookMapper.deleteMore(names);
    }


    @Override
    public int UpdatePrice(String bookName, float newPrice) {
        return bookMapper.update(bookName,newPrice);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAll();
    }

    @Override
    public Book queryByName(String name) {
        return bookMapper.queryBook(name);
    }
}
