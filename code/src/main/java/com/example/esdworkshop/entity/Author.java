package com.example.esdworkshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    // todo: add birth date and books one-to-many association
}
