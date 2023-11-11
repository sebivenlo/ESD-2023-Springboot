package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Repository interface for {@link Book} entities. It provides methods to
 * perform CRUD operations on Book entities, as well as custom queries to
 * search for books by title and author's name.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    /**
     * Searches for books whose title contains the specified keyword,
     * regardless of case.
     *
     * @param title  the title keyword to search for.
     * @return a list of books with titles containing the specified keyword.
     */
    @RestResource(rel = "findByTitle", path = "findByTitle")
    List<Book> findByTitleContainingIgnoreCase(String title);

    /**
     * Searches for books whose author's name contains the specified keyword,
     * regardless of case.
     *
     * @param authorName  the author's name keyword to search for.
     * @return a list of books with authors whose names contain the specified keyword.
     */
    @RestResource(rel = "findByAuthor", path = "findByAuthor")
    List<Book> findByAuthorNameContainingIgnoreCase(String authorName);
}
