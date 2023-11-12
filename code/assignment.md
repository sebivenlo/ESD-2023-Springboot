# Library Management System Workshop Assignment

## Introduction

Welcome to the hands-on part of the Library Management System workshop! In this assignment, you will be enhancing a
basic Spring Data REST application by incrementally adding features. A starter codebase has been provided, with certain
functionalities stripped out for you to implement.

## Getting Started

- Clone the provided workshop repository.
- Examine the structure and the existing code.
- Note the skeleton classes where code needs to be added.

## Tasks

### 1. Complete Entity Definitions

- **Book Entity**:
    - Add additional fields such as `isbn: String`, `publicationDate: Date`, and `copiesAvailable: Integer`.

- **Author Entity**:
    - Add fields like `name: String` and `birthdate: Date`.

- **Borrower Entity**:
    - Add fields like `name: String` and `email: String`.

- **LoanRecord Entity**:
    - Add fields to represent the loan details (e.g., `issueDate: Date`, `dueDate: Date`, `returnDate: Date`).

### 2. Establish Entity Relationships

- Define relationships between entities (`@ManyToOne`, `@OneToMany`):
    - Books should be related to Authors.
    - LoanRecords should be related to both Books and Borrowers.

### 3. Implement Repositories

- **BookRepository**:
    - Add custom query methods to search for books by title or author.

- **Other Repositories**:
    - Create repositories for other entities (Author, Borrower).

### 4. Implement Service Layer Logic

- **LoanService**:
    - Complete the `issueBook` method to handle issuing a book.
    - Implement validation logic to check if the book is available before issuing.

### 5. Add Validation Annotations

- Add `jakarta.validation` constraints to your entities to ensure data integrity (e.g., `@NotBlank`, `@NotNull`).

### 6. Implement Custom Search Queries

- Create custom queries in your repositories to demonstrate different search capabilities.

### 7. Extend the Loan Controller

- Implement the `issueBook` method in the `LoanController`.

### 8. Add Paging and Sorting

- Modify repository methods to support pagination and sorting for list queries.

<details>
<summary>Hint</summary>
This can be done by implementing the JpaRepository instead of the CrudRepository.
</details>

### 9. Bonus Challenges

- **Projections**:
    - Create a projection for the Book entity to show an overview with information about the author, title and publish
      date
- **Event Handling**:
    - Implement an `@RepositoryEventHandler` for Book to log actions on certain events. The base handler is
      available [here.](src/main/java/com/example/esdworkshop/event/BookEventHandler.java)
- **Implement Historical Data Tracking**
    - Create a `HistoricalLoanRecord` entity.
    - Modify `LoanService` to record historical data.
    - Implement a `HistoricalLoanRecordRepository`.
    - Create a `HistoricalLoanRecordController` with endpoints for:
        - Retrieving all historical loan records.
        - Getting historical records for specific books/borrowers.
        - Fetching records within a date range.

## Guidelines

- Complete the tasks outlined above.
- Ensure all features are working as expected.
- Test your endpoints using Postman or another REST client. The sample requests are
  available [here](src/book_requests.http).

## Additional Resources

- [Spring Data REST Reference Documentation](https://docs.spring.io/spring-data/rest/docs/current/reference/html/)
- [Spring Data JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)

