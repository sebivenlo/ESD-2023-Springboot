package com.example.esdworkshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a loan record.
 * Example of how to use LoanRecord:
 * <pre>
 * {@code
 * LoanRecord record = new LoanRecord();
 * record.setIssueDate(new Date());
 * record.setDueDate(new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000)); // e.g., 7 days from now
 * }
 * </pre>
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
public class LoanRecord {
    /**
     * The unique identifier of this loan record.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // todo: required attributes
}
