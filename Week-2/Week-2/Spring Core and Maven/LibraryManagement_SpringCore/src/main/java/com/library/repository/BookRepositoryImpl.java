package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Override
    public void saveBook(String title) {
        System.out.println("Saving book: " + title);
    }
}
