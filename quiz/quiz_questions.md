### Spring Data REST Workshop Quiz

#### Repositories
1. **What is the primary role of repositories in Spring Data REST?**
   - A. To handle HTTP requests directly
   - B. To serve as a data access layer for various entities
   - C. To validate data before persistence
   - D. To provide client-side data management

2. **In Spring Data REST, how are repository interfaces typically extended?**
   - A. `CrudRepository` or `PagingAndSortingRepository`
   - B. `JpaRepository`
   - C. `MongoRepository`
   - D. Both A and B

#### Search Parameters
3. **Which HTTP method is commonly used to perform searches in Spring Data REST?**
   - A. GET
   - B. POST
   - C. PUT
   - D. DELETE

4. **How are custom search resources defined in Spring Data REST?**
   - A. By annotating methods with `@Search`
   - B. By creating a query method in the repository interface
   - C. By using the `@Query` annotation
   - D. By defining a special `search` directory

#### Querying
5. **What is the purpose of `@Query` annotation in Spring Data REST?**
   - A. To define custom SQL queries
   - B. To create custom query methods for repositories
   - C. To specify the HTTP query parameters
   - D. To validate query responses

6. **How does Spring Data REST handle query method names?**
   - A. It ignores them completely
   - B. It uses them to automatically generate corresponding endpoints
   - C. It requires manual mapping of each method to an endpoint
   - D. It uses them for internal logging only

#### Paging/Sorting
7. **Which parameters are typically used for paging in Spring Data REST?**
   - A. `start` and `limit`
   - B. `offset` and `max`
   - C. `page` and `size`
   - D. `begin` and `end`

8. **How can you specify a default sort order for a repository in Spring Data REST?**
   - A. By using the `@SortDefault` annotation
   - B. By setting it in the application properties
   - C. By manually sorting the results in each query method
   - D. Sorting is not supported by default; it must be implemented manually

#### Projections
9. **What is a projection in the context of Spring Data REST?**
   - A. A database projection to reduce the number of columns returned
   - B. A way to alter the view of an entity without changing the entity itself
   - C. A method to project data onto a different data model
   - D. A tool for visualizing data relationships

10. **How are projections defined in Spring Data REST?**
    - A. By using the `@Projection` annotation on entity classes
    - B. By creating an interface with the desired view properties
    - C. By extending the entity class
    - D. By configuring them in the application properties

#### Validation
11. **What is the role of the `@Valid` annotation in Spring Data REST?**
    - A. To ensure that data meets business rules before it is saved
    - B. To validate HTTP requests
    - C. To encrypt data
    - D. To validate the structure of the database

12. **Where is the `@Valid` annotation typically used in Spring Data REST?**
    - A. On entity classes
    - B. On repository methods
    - C. On custom query methods
    - D. On controller methods

#### Events
13. **What is the purpose of events in Spring Data REST?**
    - A. To handle HTTP requests
    - B. To provide a way to react to lifecycle changes of entities
    - C. To validate data
    - D. To configure the application context

14. **Which of the following is an event type in Spring Data REST?**
    - A. `BeforeCreateEvent`
    - B. `AfterSaveEvent`
    - C. `PreValidateEvent`
    - D. `PostLoadEvent`

#### HAL and HATEOAS
15. **What does HAL stand for in the context of Spring Data REST?**
    - A. Hypermedia Application Language
    - B. Hypertext Application Language
    - C. Hyperlink Access Language
    - D. Hypertext Access Language

16. **What is the primary purpose of HATEOAS in Spring Data REST?**
    - A. To provide a way to navigate REST APIs through hyperlinks
    - B. To increase the performance of REST APIs
    - C. To handle HTTP requests and responses
    - D. To validate REST endpoints

#### ALPS
17. **What does ALPS stand for in the context of Spring Data REST?**
    - A. Application Level Profile Semantics
    - B. Advanced Lightweight Protocol Specification
    - C. Application Layer Protocol Syntax
    - D. Advanced Layered Paging System

18. **What is the primary use of ALPS in Spring Data REST?**
    - A. To provide metadata about the API’s data structures and capabilities
    - B. To enhance the security of the API
    - C. To compress data in API responses
    - D. To manage API versioning

#### Entity Modelling
19. **In the context of Spring Data REST, what is an entity?**
    - A. A Java class that represents a database table
    - B. A unique identifier in a database
    - C. A REST endpoint
    - D. A JSON object

20. **Which annotation is typically used to denote an entity class in Spring Data REST?**
    - A. `@Entity`
    - B. `@Table`
    - C. `@Repository`
    - D. `@Service`

