package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    // Constructor injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter injection (kept for demonstration)
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Test method to demonstrate dependency injection
    public void testService() {
        System.out.println("BookService is working!");
        if (bookRepository != null) {
            bookRepository.saveBook("Sample Book");
        } else {
            System.out.println("BookRepository is not injected!");
        }
    }
}
