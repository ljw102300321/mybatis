package com.library.mapper;

import com.library.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    User selectImplById(int userId);
    User selectByCheck(@Param("userName") String userName, @Param("userPassword") String userPassword);

}
