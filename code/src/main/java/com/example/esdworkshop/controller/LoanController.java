package com.example.esdworkshop.controller;

import com.example.esdworkshop.entity.LoanRecord;
import com.example.esdworkshop.service.LoanService;
import com.example.esdworkshop.service.LoanValidationException;
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
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    /**
     * Issues a book based on the given loan record.
     *
     * @param loanRecord the loan record containing information about the book and borrower
     * @return a ResponseEntity object indicating the result of the operation
     */
    @PostMapping("/issue")
    public ResponseEntity<String> issueBook(@RequestBody LoanRecord loanRecord) {
        try {
            loanService.issueBook(loanRecord);
            return ResponseEntity.ok("Book issued successfully");
        } catch (LoanValidationException e) {
            // Handle the validation error, e.g., return a bad request response
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

