package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Exercise 1, 2, 3, 5, 6, 7, 8: Main class to test everything
public class LibraryManagementApplication {

    public static void main(String[] args) {

        // Load Spring application context from XML config
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("=== Spring Context Loaded Successfully ===\n");

        // Get BookService bean from Spring container
        BookService bookService = (BookService) context.getBean("bookService");

        // Test Exercise 1 & 2: Basic Spring + Dependency Injection
        System.out.println("\n--- Testing getBook() ---");
        String book = bookService.getBook(101);
        System.out.println("Result: " + book);

        // Test Exercise 3 & 8: AOP logging (check console for AOP messages)
        System.out.println("\n--- Testing addBook() ---");
        bookService.addBook("Clean Code");

        System.out.println("\n=== All Exercises Verified ===");

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}