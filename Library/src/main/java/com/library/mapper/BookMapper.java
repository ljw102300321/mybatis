package com.library.mapper;

import com.library.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    public List<Book> selectAll();
    // 使用 @Param 注解明确指定参数名
    public List<Book> selectBy(
            @Param("orderBy") String orderBy,
            @Param("selectType") String selectType,
            @Param("selectValues") String... selectValues
    );
    public Book selectById(int id);
    public int insertBook(Book book);
    public int updateStatus(@Param("status") String status, @Param("bookId") int bookId);
    public  int deleteBook(int bookId);

}
