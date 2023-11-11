package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.LoanRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link LoanRecord} entities. It provides methods to
 * perform CRUD operations on LoanRecord entities.
 */
public interface LoanRecordRepository extends JpaRepository<LoanRecord, Long> {
}
