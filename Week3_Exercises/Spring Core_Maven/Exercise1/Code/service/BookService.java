package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String bookId) {
        return bookRepository.findBookById(bookId);
    }

    public void addBook(String book) {
        bookRepository.saveBook(book);
    }
}