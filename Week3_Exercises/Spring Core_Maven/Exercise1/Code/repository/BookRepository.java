package com.library.repository;

public class BookRepository {
    public String findBookById(String id) {
        return "Book with ID: " + id ;
    }

    public void saveBook(String book) {
        System.out.println("Saving book: " + book);
    }
}