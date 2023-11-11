package com.example.esdworkshop.controller;

import com.example.esdworkshop.entity.LoanRecord;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The LoanController class is a Spring Framework controller that handles loan-related requests.
 * It is annotated with @RepositoryRestController to indicate that it is a Spring component and that
 * it handles RESTful requests for loans.
 */
@RepositoryRestController("/loans")
public class LoanController {

    /**
     * Issues a book based on the given loan record.
     *
     * @param loanRecord the loan record containing information about the book and borrower
     * @return a ResponseEntity object indicating the result of the operation
     */
    @PostMapping("/issue")
    public ResponseEntity<String> issueBook(@RequestBody LoanRecord loanRecord) {
        // todo

        // functional requirements:
        // Use the LoanService to issue the book and return 200 (OK).
        // Catch any LoanValidationExceptions and handle them appropriately (400 Bad Request).
        return null;
    }
}
