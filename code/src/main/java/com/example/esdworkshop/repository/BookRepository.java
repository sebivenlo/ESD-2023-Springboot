package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Book} entities. It provides methods to
 * perform CRUD operations on Book entities, as well as custom queries to
 * search for books by title and author's name.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    // todo: implement findByTitle and findByAuthor query methods
}
