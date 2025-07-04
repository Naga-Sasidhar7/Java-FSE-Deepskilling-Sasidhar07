package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String findBookById(String id) {
        return "Book details for ID: " + id ;
    }

    public void saveBook(String bookTitle) {
        System.out.println("Book saved: " + bookTitle);
    }
}