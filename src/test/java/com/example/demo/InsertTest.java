package com.example.demo;

import com.example.demo.mappers.PeopleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class InsertTest {

    @Test
    public void testCRUD() throws IOException{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PeopleMapper mapper = sqlSession.getMapper(PeopleMapper.class);
        mapper.updateperson();
        sqlSession.commit();
        System.out.println("finish");
    }
}
