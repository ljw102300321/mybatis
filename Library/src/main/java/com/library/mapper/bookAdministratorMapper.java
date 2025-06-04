package com.library.mapper;

import com.library.pojo.bookAdministrator;
import org.apache.ibatis.annotations.Param;

public interface bookAdministratorMapper {
    public bookAdministrator selectExit(@Param("admin_id")int adminId,
                                        @Param("admin_name") String adminName,
                                        @Param("admin_password") String adminPassword);

}
