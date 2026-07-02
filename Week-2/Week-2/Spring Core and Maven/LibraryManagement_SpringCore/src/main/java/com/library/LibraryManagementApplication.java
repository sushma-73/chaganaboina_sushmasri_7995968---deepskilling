package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the BookService bean from the container
        BookService bookService = context.getBean("bookService", BookService.class);
        
        // Test the service
        bookService.testService();
        
        // Close the context (not strictly necessary for a simple app, but good practice)
        ((ClassPathXmlApplicationContext) context).close();
    }
}
