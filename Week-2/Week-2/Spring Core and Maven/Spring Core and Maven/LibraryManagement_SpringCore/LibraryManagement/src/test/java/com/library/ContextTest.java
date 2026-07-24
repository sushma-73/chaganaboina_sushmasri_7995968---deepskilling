package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class ContextTest {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Check if BookService bean exists
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("BookService bean found: " + (bookService != null));
        
        // Check if BookRepository bean exists
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
        System.out.println("BookRepository bean found: " + (bookRepository != null));
        
        // Verify dependency injection worked
        if (bookService != null && bookRepository != null) {
            System.out.println("Dependency injection successful: BookService has BookRepository");
            bookService.testService(); // This will also trigger the AOP advice
        } else {
            System.out.println("Dependency injection failed!");
        }
        
        // Show all bean names for verification
        System.out.println("\nAll bean definitions:");
        for String beanName : context.getBeanDefinitionNames()) {
            System.out.println(" - " + beanName);
        }
        
        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
