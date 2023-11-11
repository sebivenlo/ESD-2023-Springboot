package com.example.esdworkshop.service;

import com.example.esdworkshop.entity.LoanRecord;
import jakarta.validation.ConstraintViolation;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Exception thrown when there are validation errors while processing a loan.
 */
public class LoanValidationException extends RuntimeException {
    private final Set<ConstraintViolation<LoanRecord>> violations;

    public LoanValidationException(Set<ConstraintViolation<LoanRecord>> violations) {
        this.violations = violations;
    }

    @Override
    public String getMessage() {
        String book = violations.stream().map(Object::toString).collect(Collectors.joining(", "));
        return "Could not issue book: %s".formatted(book);
    }
}
