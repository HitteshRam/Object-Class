package com.Bookstore;

public class Book {
    private int ISBNNo;
    private String title;
    private String description;
    private double price;

    Author author;

    public Book(int ISBNNo, String title, String description, double price, Author author) {
        this.ISBNNo = ISBNNo;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author= author;
    }

    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayBookDetails(){
        System.out.println("ISBNNo = " + ISBNNo);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
        System.out.println(author);
    }

}
