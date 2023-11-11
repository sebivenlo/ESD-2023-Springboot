# Book Management System

A Spring Boot application leveraging Spring Data REST to manage books and their related operations.

## Features

- **CRUD Operations for Books**: Create, Read, Update, and Delete operations for books.

- **Search Capabilities**:
    - Search books by their title.
    - Find books based on the author's name.

- **Validation**:
    - Ensure books are available in stock before issuing.

- **Pagination and Sorting**:
    - Retrieve paginated lists of books.
    - Sort lists by various attributes, such as title and publication date.

- **Event Handlers**:
    - Custom actions performed before saving a book, for example, sending email notifications (demonstrated
      conceptually).

## Example Requests

To interact with the system, you can use the provided HTTP client file: [books_requests.http](src/book_requests.http).
This file contains a set
of example requests to showcase the available features.

Some of the example requests include:

- Creating a new author.
- Adding a new book.
- Searching for books by title or author's name.
- Updating the number of available copies for a book.
- Fetching books with pagination and sorting options.

Open the `books-requests.http` file in IntelliJ IDEA and execute the requests directly to interact with the application.

## Development

This project was developed using IntelliJ IDEA, which provides a robust environment for Java development with features
such as intelligent code assistance, debugging support, and integrated testing capabilities.

### Prerequisites

- **Java**: The project uses Java 19. Ensure you have a compatible JDK installed. You can download and install it
  from [the official Oracle website](https://www.oracle.com/java/technologies/javase-jdk19-downloads.html) or use an
  alternative distribution like AdoptOpenJDK.

- **IDE**: While the project can be developed with any preferred IDE, IntelliJ IDEA was the primary tool used during
  development. It's recommended to use IntelliJ for consistency, especially when using the provided `.http` files for
  API testing. You can download the IDE from [the official JetBrains website](https://www.jetbrains.com/idea/).
