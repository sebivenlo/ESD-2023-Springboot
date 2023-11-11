package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a book.
 * Example of how to use Book:
 * <pre>
 * {@code
 * Book book = new Book();
 * book.setTitle("The Great Gatsby");
 * book.setIsbn("1234567890123");
 * book.setPublicationDate(new Date());
 * book.setCopiesAvailable(5);
 * }
 * </pre>
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    /**
     * The unique identifier of this book.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The title of this book.
     */
    @NotBlank(message = "Title is required")
    private String title;

    /**
     * Checks if the book is available in stock.
     *
     * @return true if there are more than 0 copies available, false otherwise.
     */
    @Transient
    @AssertTrue(message = "Book is not in stock")
    public boolean isAvailable() {
        // todo implement this
        return false;
    }

    // todo: add isbn, publicationDate, copiesAvailable, author and loanRecords
}
