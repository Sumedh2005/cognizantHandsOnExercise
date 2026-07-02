package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Exercise 6: @Service annotation for component scanning
@Service
public class BookService {

    private BookRepository bookRepository;

    // Exercise 7: Constructor Injection
    public BookService() {
        // default constructor needed for setter injection
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService: Constructor injection used.");
    }

    // Exercise 2 & 7: Setter Injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService: Setter injection used.");
    }

    public String getBook(int id) {
        System.out.println("BookService: getBook() called.");
        return bookRepository.findBookById(id);
    }

    public void addBook(String bookName) {
        System.out.println("BookService: addBook() called.");
        bookRepository.saveBook(bookName);
    }
}