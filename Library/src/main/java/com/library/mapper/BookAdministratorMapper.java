package com.library.mapper;

import com.library.pojo.BookAdministrator;
import org.apache.ibatis.annotations.Param;

public interface BookAdministratorMapper {
    public BookAdministrator selectExit(@Param("admin_id")int adminId,
                                        @Param("admin_name") String adminName,
                                        @Param("admin_password") String adminPassword);

}
