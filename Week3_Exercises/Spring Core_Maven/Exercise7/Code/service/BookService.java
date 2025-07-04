package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String initMessage;           // Constructor injection
    private BookRepository bookRepository; // Setter injection

    // Constructor for constructor injection
    public BookService(String initMessage) {
        this.initMessage = initMessage;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("Constructor Injected Message: " + initMessage);
        System.out.println("BookService: Calling repository");
        bookRepository.displayBooks();
    }
}

