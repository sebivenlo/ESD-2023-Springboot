package com.example.esdworkshop.service;


import com.example.esdworkshop.entity.Book;
import com.example.esdworkshop.entity.LoanRecord;
import com.example.esdworkshop.repository.LoanRecordRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit test for the loan service component
 */
@ExtendWith(SpringExtension.class)
public class LoanServiceTest {

    @Mock
    private Validator validator;

    @Mock
    private LoanRecordRepository loanRecordRepository;

    @InjectMocks
    private LoanService loanService;

    private LoanRecord loanRecord;

    @BeforeEach
    public void setUp() {
        loanRecord = new LoanRecord();
        Book book = new Book();

        book.setTitle("Test");
        book.setIsbn("123");
        book.setCopiesAvailable(50);
        book.setPublicationDate(new Date());
        loanRecord.setBook(book);
    }

    @Test
    public void whenIssueBookWithValidLoanRecordThenSaveLoanRecord() {
        when(validator.validate(loanRecord)).thenReturn(Collections.emptySet());
        when(loanRecordRepository.save(any(LoanRecord.class))).thenReturn(loanRecord);

        assertThatCode(() -> loanService.issueBook(loanRecord)).doesNotThrowAnyException();
        verify(loanRecordRepository).save(loanRecord);
    }

    @Test
    public void whenIssueBookWithInvalidLoanRecordThenThrowLoanValidationException() {
        Set<ConstraintViolation<LoanRecord>> mockViolations = mockViolations();
        when(validator.validate(loanRecord)).thenReturn(mockViolations);

        assertThatExceptionOfType(LoanValidationException.class)
                .isThrownBy(() -> loanService.issueBook(loanRecord));
    }

    @SuppressWarnings("unchecked")
    private Set<ConstraintViolation<LoanRecord>> mockViolations() {
        return Collections.singleton(Mockito.mock(ConstraintViolation.class));
    }
}

