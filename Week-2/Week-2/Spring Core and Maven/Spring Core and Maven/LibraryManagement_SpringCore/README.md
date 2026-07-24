# Library Management - Spring Core Example

A simple Spring Framework project demonstrating Dependency Injection using XML configuration.

## Project Structure

- `src/main/java/com/library/service/BookService.java` - Service class that uses BookRepository
- `src/main/java/com/library/repository/BookRepository.java` - Repository interface
- `src/main/java/com/library/repository/BookRepositoryImpl.java` - Repository implementation
- `src/main/java/com/library/LibraryManagementApplication.java` - Main application class
- `src/main/resources/beans.xml` - Spring XML configuration file
- `pom.xml` - Maven project configuration

## How to Run

1. Ensure you have Maven installed (version 3.x+)
2. Navigate to the project directory
3. Run: `mvn clean compile exec:java`

## Expected Output

```
BookService is working!
Saving book: Sample Book
```

## Explanation

- The `BookService` class has a dependency on `BookRepository`
- The dependency is injected via setter method using Spring's XML configuration (`beans.xml`)
- The main application loads the Spring context from `beans.xml`, retrieves the `bookService` bean, and calls its `testService()` method
- Spring automatically injects the `bookRepository` dependency into the `BookService` instance

## Technologies Used

- Java 8
- Spring Framework 5.3.30
- Maven 3.x
