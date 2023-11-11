package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Author} entities. It provides methods to
 * perform CRUD operations on Author entities.
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
