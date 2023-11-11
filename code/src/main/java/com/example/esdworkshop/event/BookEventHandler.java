package com.example.esdworkshop.event;


import com.example.esdworkshop.entity.Book;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for handling events related to books. It is annotated with @Component and @RepositoryEventHandler
 * to indicate that it is a Spring bean and an event handler for repository events, respectively.
 */
@Component
@RepositoryEventHandler
public class BookEventHandler {

    // Before creating a book
    @HandleBeforeCreate
    public void handleBookCreate(Book book) {
        // For demonstration: print a message
        System.out.println("Before creating a book: " + book.getTitle());
        // Here you could integrate with an email service to send a notification
    }

    // Before saving a book (e.g., issuing or returning)
    @HandleBeforeSave
    public void handleBookSave(Book book) {
        // For demonstration: print a message
        System.out.println("Before saving a book: " + book.getTitle());
        // Here you could check if the number of copies changed to see if a book was issued or returned and send an email notification accordingly
    }
}
