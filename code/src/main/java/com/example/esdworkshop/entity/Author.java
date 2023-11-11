package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 * Represents an author of books.
 * <p>
 * The Author class is a JPA entity class that represents an author with an ID, name, birthdate, and a set of books.
 * <p>
 * <b>Usage:</b>
 *
 * <pre>{@code
 * Author author = new Author();
 * author.setName("John Doe");
 * author.setBirthdate(new Date());
 *
 * Set<Book> books = new HashSet<>();
 * // Add books to the author's set of books
 * author.setBooks(books);
 * }</pre>
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    /**
     * The unique identifier of this author.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * The name of this author.
     */
    private String name;
    /**
     * The birthdate of this author.
     */
    private Date birthdate;
    /**
     * The books this author has composed.
     */
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Book> books;
}
