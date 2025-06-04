package com.library.mapper;

import com.library.pojo.BorrowRecord;
import com.library.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.time.LocalDateTime;


public class BorrowRecordMapperTest {

    @Test
    public void insert() throws Exception {
        // 1. 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 2. 获取 Mapper
        BorrowRecordMapper borrowRecordMapper = sqlSession.getMapper(BorrowRecordMapper.class);
        // 3. 执行方法
        BorrowRecord borrowRecord = new BorrowRecord(1, 1, 1, 1, LocalDateTime.now(), LocalDateTime.now().plusDays(7), null);
        int i = borrowRecordMapper.insert(borrowRecord);
        // 4. 提交事务
        sqlSession.commit();
        // 5. 释放资源
        sqlSession.close();
    }

    @Test
    public void delete() throws Exception {

        // 1. 获取 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 2. 获取 Mapper
        BorrowRecordMapper borrowRecordMapper = sqlSession.getMapper(BorrowRecordMapper.class);
        // 3. 执行方法
        int i = borrowRecordMapper.delete(1);
        // 4. 提交事务
        sqlSession.commit();
        // 5. 释放资源
        sqlSession.close();
    }


}
