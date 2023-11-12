package com.example.esdworkshop.repository;

import com.example.esdworkshop.entity.Book;
import com.example.esdworkshop.entity.HistoricalLoanRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Repository interface for {@link HistoricalLoanRecord} entities. It provides methods to
 * perform CRUD operations on record entities.
 */
public interface HistoricalLoanRecordRepository extends JpaRepository<HistoricalLoanRecord, Long> {
    /**
     * Finds all historical loan records associated with the given book.
     *
     * @param book The book to search for.
     * @return A list of historical loan records related to the given book.
     */
    List<HistoricalLoanRecord> findAllByBook(Book book);

    /**
     * Finds all historical loan records whose issue date is between the specified start and end date.
     *
     * @param startDate The start date to search for. (inclusive)
     * @param endDate   The end date to search for. (inclusive)
     * @return A list of historical loan records whose issue date falls within the specified date range.
     */
    List<HistoricalLoanRecord> findByIssueDateBetween(Date startDate, Date endDate);

}
