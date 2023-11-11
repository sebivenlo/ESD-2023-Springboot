package com.example.esdworkshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a borrower.
 * Example of how to use Borrower:
 * <pre>
 * {@code
 * Borrower borrower = new Borrower();
 * borrower.setName("John Doe");
 * borrower.setEmail("johndoe@example.com");
 * }
 * </pre>
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Borrower {

    /**
     * The unique identifier of this borrower.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // todo: add name, email, and loanRecords association
}
