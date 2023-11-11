package com.example.esdworkshop.controller.advice;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

/**
 * The default constraint violation handler for all controllers
 */
@ControllerAdvice
public class ConstraintViolationExceptionAdvice {
    private record Violation(String path, String message) {
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleException(ConstraintViolationException exception) {
        var errors = exception.getConstraintViolations().stream()
                .map(exc -> new Violation(String.valueOf(exc.getPropertyPath()), exc.getMessage()))
                .toList();

        HashMap<String, Object> body = new HashMap<>();
        body.put("error", errors);
        return ResponseEntity.badRequest().body(body);
    }
}
