package com.library.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowRecord {

    private int borrowId;
    private int bookId;
    private int userId;
    private int administratorId;
    private LocalDateTime borrowDate;
    private LocalDateTime shouldReturnDate;
    private LocalDateTime returnDate;
    public BorrowRecord(int bookId, int userId, int administratorId, LocalDateTime borrowDate, LocalDateTime shouldReturnDate, LocalDateTime returnDate) {
        this.bookId = bookId;
        this.userId = userId;
        this.administratorId = administratorId;
        this.borrowDate = borrowDate;
        this.shouldReturnDate = shouldReturnDate;
        this.returnDate = returnDate;
    }
}
