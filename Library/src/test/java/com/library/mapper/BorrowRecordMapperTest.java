package com.library.mapper;

import com.library.pojo.BorrowRecord;
import com.library.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BorrowRecordMapperTest {


    @Test
    public void insert() throws Exception {
        String resource = "mybatis-config.xml";
        SqlSession sqlSession = GetSqlSession.getSqlSession(resource);
        BorrowRecordMapper mapper = sqlSession.getMapper(BorrowRecordMapper.class);
        BorrowRecord borrowRecord = new BorrowRecord(4, 1, 1,LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now());
        int i = mapper.insert(borrowRecord);
        sqlSession.commit();
    }


}
