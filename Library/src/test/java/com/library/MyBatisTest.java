package com.library;

import com.library.mapper.BookMapper;
import com.library.mapper.bookAdministratorMapper;
import com.library.pojo.Book;
import com.library.pojo.GetSqlSession;
import com.library.pojo.bookAdministrator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void test1() throws IOException {
        //代理开发
        //1.加载mybatis的核心配置文件，获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        SqlSession sqlSession = GetSqlSession.getSqlSession(resource);
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        //List<Book> list=BookMapper.selectAll();
        //System.out.println(list);
        //Book book=bookMapper.selectById(1);
        //System.out.println(book);
        //bookMapper.insertBook(new Book(21,"清华集注","张三","清华大学出版社","2020-01-01","计算机","notBorrowed"));
        //bookMapper.updateStatus("isBorrowed",21);
    /*    List<Book> list=bookMapper.selectBy("publish_date","desc","bookName","author","publishDate","publisher");
        for (Book book:list)
            System.out.println(book);

     */
        //bookMapper.deleteBook(21);
        bookAdministratorMapper bookAdministratorMapper = sqlSession.getMapper(bookAdministratorMapper.class);
        bookAdministrator bookAdministrator = bookAdministratorMapper.selectExit(1,"ljw","102300321");
        sqlSession.commit();
        sqlSession.close();

    }
}
