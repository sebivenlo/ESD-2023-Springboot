package com.example.esdworkshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

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

    /**
     * The name of this borrower.
     */
    private String name;

    /**
     * The email address of this borrower.
     */
    private String email;

    /**
     * The set of loan records associated with this borrower.
     */
    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
    private Set<LoanRecord> loanRecords;
}
