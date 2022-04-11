package com.example.bookdemo.pojo;

public class Book {

    private int bookID;
    private String bookName;
    private float price;

    public Book(String bookName, float price) {
        this.bookName = bookName;
        this.price = price;
    }

    public Book(int id, String bookName, float price) {
        this.bookID = id;
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
