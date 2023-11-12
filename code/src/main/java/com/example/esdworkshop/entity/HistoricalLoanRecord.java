package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Represents a historical loan record.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class HistoricalLoanRecord {
    /**
     * The unique identifier of this record.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The associated book of this record.
     */
    @ManyToOne
    @NotNull
    private Book book;

    /**
     * The associated borrower of the book.
     */
    @ManyToOne
    @NotNull
    private Borrower borrower;

    /**
     * The date the underlying book was issued.
     */
    @NotNull
    private Date issueDate;

    /**
     * The date the underlying book was returned.
     */
    @NotNull
    private Date returnDate;

    /**
     * The current status of this record.
     */
    @NotBlank
    private String status;
}
