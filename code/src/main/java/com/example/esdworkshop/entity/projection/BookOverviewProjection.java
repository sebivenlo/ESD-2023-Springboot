package com.example.esdworkshop.entity.projection;

import com.example.esdworkshop.entity.Author;
import com.example.esdworkshop.entity.Book;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Represents a projection interface for the overview of a book.
 */
@Projection(types = {Book.class}, name = "overview")
public interface BookOverviewProjection {
    String getTitle();

    Author getAuthor();

    Date getPublicationDate();
}
