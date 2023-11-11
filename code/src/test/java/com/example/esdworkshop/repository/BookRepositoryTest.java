package com.example.esdworkshop.repository;


import com.example.esdworkshop.entity.Author;
import com.example.esdworkshop.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
/**
 * This class is responsible for testing the functionalities of the BookRepository class.
 * It utilizes the DataJpaTest annotation to load the necessary Spring components for testing JPA repositories.
 * <p>
 * The BookRepositoryTest class contains various test methods to validate the behavior of the BookRepository class.
 * It makes use of the TestEntityManager and BookRepository which are autowired dependencies.
 */
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    private Book createTestBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        book.setIsbn("123");
        book.setCopiesAvailable(50);
        book.setPublicationDate(new Date());

        var author = new Author();
        author.setName("TestAuthor");
        author.setBirthdate(new Date());
        entityManager.persist(author);
        entityManager.flush();

        book.setAuthor(author);
        entityManager.persist(book);
        entityManager.flush();
        return book;
    }

    @Test
    public void whenFindByIdThenReturnBook() {
        var book = createTestBook("findById");
        Optional<Book> found = bookRepository.findById(1L);
        assertThat(found.isPresent()).isTrue();
        assertThat(found.get().getTitle()).isEqualTo(book.getTitle());
    }

    @Test
    void whenFindByTitleContainingIgnoreCaseThenReturnBook() {
        var book = createTestBook("findByTitle");
        var books = bookRepository.findByTitleContainingIgnoreCase("FINDBYTITLE");
        assertThat(books).asList().containsExactly(book);
    }

    @Test
    void whenFindByAuthorNameContainingIgnoreCaseThenReturnBook() {
        var firstBook = createTestBook("findByAuthor1");
        var secondBook = createTestBook("findByAuthor2");
        var books = bookRepository.findByAuthorNameContainingIgnoreCase("testAUTHOR");
        assertThat(books).asList().containsExactly(firstBook, secondBook);
    }
}
