package com.library.pojo;

import java.time.LocalDate;

public class Book {
private int bookId;
private String bookName;
private String author ;
private String publisher;
private String publishDate;
private String type ;
private String status;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, String publisher, String publishDate, String type, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.type = type;
        this.status = status;
    }

    /**
     * 获取
     * @return bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * 设置
     * @param bookId
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取
     * @return bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 获取
     * @return publishDate
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 设置
     * @param publishDate
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "Book{bookId = " + bookId + ", bookName = " + bookName + ", author = " + author + ", publisher = " + publisher + ", publishDate = " + publishDate + ", type = " + type + ", status = " + status + "}";
    }
}
