package com.library.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
    public static SqlSession getSqlSession(String resource) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用它来执行sql
        //2.使用SqlSessionFactory对象，获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
