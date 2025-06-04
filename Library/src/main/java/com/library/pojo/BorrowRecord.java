package com.library.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowRecord {

    private int borrowId;
    private int bookId;
    private int userId;
    private int administratorId;
    private String borrowDate;
    private String shouldReturnDate;
    private String returnDate;
}
