package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);


        String bookDetails = bookService.getBookDetails("123");
        System.out.println(bookDetails);

        bookService.addBook("Java Fundamentals");

        System.out.println("Spring application is running!");
    }
}