package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

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

    /**
     * The date when the book was issued.
     */
    private Date issueDate;

    /**
     * The due date by which the book should be returned.
     */
    private Date dueDate;

    /**
     * The date when the book was returned.
     */
    private Date returnDate;

    /**
     * The borrower associated with this loan record.
     */
    @ManyToOne
    private Borrower borrower;

    /**
     * The book associated with this loan record.
     */
    @ManyToOne
    @Valid
    @NotNull(message = "Book cannot be null")
    private Book book;
}
