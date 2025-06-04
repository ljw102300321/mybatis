package com.library.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;
    private String userName;
    private String userPassword;
    List<BorrowRecord> borrowRecordList;
}
