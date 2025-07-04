package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("Testing Dependency Injection");

        String bookInfo = bookService.getBookDetails("DI-456");
        System.out.println(bookInfo);
        bookService.addNewBook("Spring Dependency Injection Guide");

        System.out.println("Test Completed");
    }
}