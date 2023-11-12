package com.example.esdworkshop.service;

import com.example.esdworkshop.entity.HistoricalLoanRecord;
import com.example.esdworkshop.entity.LoanRecord;
import com.example.esdworkshop.repository.HistoricalLoanRecordRepository;
import com.example.esdworkshop.repository.LoanRecordRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Service class responsible for handling book loan operations.
 */
@Service
public class LoanService {

    /**
     * Validator used to validate loan records before issuing books.
     */
    private final Validator validator;

    /**
     * Repository used to manage and persist loan records.
     */
    private final LoanRecordRepository loanRecordRepository;

    /**
     * Repository used to manage and persist historical loan records.
     */
    private final HistoricalLoanRecordRepository historicalLoanRecordRepository;

    /**
     * Constructs a new instance of LoanService with the specified validator and loan record repository.
     *
     * @param validator            the validator to be used for validating loan records.
     * @param loanRecordRepository the repository used for managing and persisting loan records.
     */
    public LoanService(Validator validator, LoanRecordRepository loanRecordRepository, HistoricalLoanRecordRepository historicalLoanRecordRepository) {
        this.validator = validator;
        this.loanRecordRepository = loanRecordRepository;
        this.historicalLoanRecordRepository = historicalLoanRecordRepository;
    }

    /**
     * Issues a book by validating and saving the provided loan record.
     *
     * @param loanRecord the loan record to be validated and saved.
     * @throws LoanValidationException if there are validation errors in the loan record.
     */
    public void issueBook(LoanRecord loanRecord) {
        Set<ConstraintViolation<LoanRecord>> violations = validator.validate(loanRecord);

        if (!violations.isEmpty()) {
            // Handle validation errors.
            throw new LoanValidationException(violations);
        }

        // If book is valid and available, save the loan record
        loanRecordRepository.save(loanRecord);

        // Save the historical record
        HistoricalLoanRecord historicalRecord = new HistoricalLoanRecord();
        historicalRecord.setBook(loanRecord.getBook());
        historicalRecord.setBorrower(loanRecord.getBorrower());
        historicalRecord.setIssueDate(loanRecord.getIssueDate());
        historicalRecord.setStatus("ISSUED");

        historicalLoanRecordRepository.save(historicalRecord);
    }
}
