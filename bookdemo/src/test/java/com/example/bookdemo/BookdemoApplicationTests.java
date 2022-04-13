package com.example.bookdemo;

import com.example.bookdemo.mappers.BookMapper;
import com.example.bookdemo.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BookdemoApplicationTests {

    @Test
    void contextLoads() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> lists = new ArrayList<>();
        lists.add(new Book("a", ((float) 39.1)));
        lists.add(new Book("b", ((float) 39.2)));
        lists.add(new Book("c", ((float) 39.3)));

        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        List<Book> books = mapper.queryAll();
        books.forEach(b-> System.out.println(b));

//        Book java = mapper.queryBook("java");
//        System.out.println(java);
        sqlSession.commit();
//        System.out.println("finish"+"  "+ap);
    }

}
