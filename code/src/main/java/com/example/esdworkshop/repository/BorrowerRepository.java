package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Borrower} entities. It provides methods to
 * perform CRUD operations on Borrower entities.
 */
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
