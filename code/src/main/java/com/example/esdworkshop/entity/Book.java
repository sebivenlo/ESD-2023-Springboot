package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

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
     * The ISBN (International Standard Book Number) of this book.
     */
    @NotBlank(message = "Isbn is required")
    private String isbn;

    /**
     * The publication date of this book.
     */
    @NotNull(message = "Publication date is required")
    private Date publicationDate;

    /**
     * The number of copies available for this book.
     */
    @NotNull(message = "Number of copies available is required")
    private Integer copiesAvailable;

    /**
     * The author of this book.
     */
    @ManyToOne
    private Author author;

    /**
     * The set of loan records associated with this book.
     */
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<LoanRecord> loanRecords;

    /**
     * Checks if the book is available in stock.
     *
     * @return true if there are more than 0 copies available, false otherwise.
     */
    @Transient
    @AssertTrue(message = "Book is not in stock")
    public boolean isAvailable() {
        return copiesAvailable > 0;
    }
}
