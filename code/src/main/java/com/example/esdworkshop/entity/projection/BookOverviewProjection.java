package com.example.esdworkshop.entity.projection;

import com.example.esdworkshop.entity.Book;
import org.springframework.data.rest.core.config.Projection;

/**
 * Represents a projection interface for the overview of a book.
 */
@Projection(types = {Book.class}, name = "overview")
public interface BookOverviewProjection {
    /**
     * Returns the title of the object.
     *
     * @return the title of the object as a String.
     */
    String getTitle();

    // todo: Add author and title
}
