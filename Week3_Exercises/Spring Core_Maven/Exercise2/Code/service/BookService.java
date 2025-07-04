package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String bookId) {
        return bookRepository.findBookById(bookId);
    }

    public void addNewBook(String bookTitle) {
        bookRepository.saveBook(bookTitle);
    }
}