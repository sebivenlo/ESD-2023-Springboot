package com.example.esdworkshop.controller;

import com.example.esdworkshop.entity.HistoricalLoanRecord;
import com.example.esdworkshop.repository.BookRepository;
import com.example.esdworkshop.repository.HistoricalLoanRecordRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * The HistoricalLoanController class is a controller class that handles RESTful API calls
 * related to historical loan records.
 * It provides endpoints for retrieving historical loan records.
 */
@RepositoryRestController("/historicalLoans")
public class HistoricalLoanController {

    private final HistoricalLoanRecordRepository historicalLoanRecordRepository;
    private final BookRepository bookRepository;

    public HistoricalLoanController(HistoricalLoanRecordRepository historicalLoanRecordRepository,
                                    BookRepository bookRepository) {
        this.historicalLoanRecordRepository = historicalLoanRecordRepository;
        this.bookRepository = bookRepository;
    }

    /**
     * Retrieves all historical loan records.
     *
     * @return a list of HistoricalLoanRecord objects representing all historical loan records.
     */
    @GetMapping
    public List<HistoricalLoanRecord> getAllHistoricalLoans() {
        return historicalLoanRecordRepository.findAll();
    }

    /**
     * Retrieves all historical loan records for a specific book.
     *
     * @param bookId the ID of the book to retrieve the historical loan records for
     * @return a ResponseEntity containing a list of HistoricalLoanRecord objects representing all historical loan records
     * for the specified book, or a ResponseEntity with status code 404 (Not Found) if the book is not found
     */
    @GetMapping("/book/{bookId}")
    public ResponseEntity<Object> getAllHistoricalLoansForBook(@PathVariable Long bookId) {
        var book = bookRepository.findById(bookId);
        if (book.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        var records = historicalLoanRecordRepository.findAllByBook(book.get());
        return ResponseEntity.ok(records);
    }

    /**
     * Retrieves all historical loan records within a specified date range.
     *
     * @param startDate the start date of the range to retrieve historical loan records for
     * @param endDate   the end date of the range to retrieve historical loan records for
     * @return a List of HistoricalLoanRecord objects representing all historical loan records within the specified date range
     */
    public List<HistoricalLoanRecord> getHistoricalLoansInRange(
            @RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @RequestParam("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate
    ) {
        return historicalLoanRecordRepository.findByIssueDateBetween(startDate, endDate);
    }
}
