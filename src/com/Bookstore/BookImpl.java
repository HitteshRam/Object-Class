package com.Bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Author author= new Author("Bhagat Guru", "Chetan Bhagat");
        Book book= new Book(12345, "two states", "Bakwas story", 200.50,
                author);
        author.setAuthorName("Robin Sharma");
        author.setPenName("RobSam");
        book.displayBookDetails();
    }
}
