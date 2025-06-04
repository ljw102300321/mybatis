package com.library.mapper;

import com.library.pojo.User;
import com.library.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {


    @Test
    public void selectImplById() throws Exception{

        String resource = "mybatis-config.xml";
        SqlSession sqlSession = GetSqlSession.getSqlSession(resource);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectImplById(1);
        System.out.println(user);

    }


}
