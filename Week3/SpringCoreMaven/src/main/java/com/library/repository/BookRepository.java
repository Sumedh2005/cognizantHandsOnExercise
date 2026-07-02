package com.library.repository;

import org.springframework.stereotype.Repository;

// Exercise 6: @Repository annotation for component scanning
@Repository
public class BookRepository {

    public String findBookById(int id) {
        // Simulating fetching a book from DB
        return "Book with ID: " + id + " - 'Spring in Action'";
    }

    public void saveBook(String bookName) {
        System.out.println("BookRepository: Saving book -> " + bookName);
    }
}