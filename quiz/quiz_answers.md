
#### Repositories
1. **B. To serve as a data access layer for various entities**
   - Explanation: Repositories in Spring Data REST abstract the data layer, providing a mechanism to perform CRUD operations on entities without needing to write detailed data access code.

2. **D. Both A and B**
   - Explanation: Spring Data REST allows repositories to extend `CrudRepository` or `PagingAndSortingRepository` for basic CRUD and paging/sorting functionalities, and `JpaRepository` for JPA-specific operations.

#### Search Parameters
3. **A. GET**
   - Explanation: Search operations in RESTful services are typically performed using GET requests, which request data from a specified resource.

4. **B. By creating a query method in the repository interface**
   - Explanation: Custom search resources in Spring Data REST are defined by creating query methods in the repository interface. These methods are automatically exposed as search endpoints.

#### Querying
5. **A. To define custom SQL queries**
   - Explanation: The `@Query` annotation is used to define custom querys in the repository interfaces, allowing for complex queries beyond standard CRUD operations.

6. **B. It uses them to automatically generate corresponding endpoints**
   - Explanation: Spring Data REST automatically exposes query methods as RESTful endpoints based on the method name, following its naming convention for query derivation.

#### Projections
7. **B. A way to alter the view of an entity without changing the entity itself**
   - Explanation: Projections in Spring Data REST allow for creating customized views of an entity, enabling the exposure of a subset of attributes or the inclusion of computed properties.

8. **B. By creating an interface with the desired view properties**
    - Explanation: Projections are defined by creating an interface with getter methods for the properties to be included in the view.

#### Validation
9. **A. To ensure that data meets business rules before it is saved**
    - Explanation: The `@Valid` annotation is used in conjunction with Spring's validation mechanism to ensure that data adheres to constraints defined in the domain model before persisting it.

#### Events
10. **B. To provide a way to react to lifecycle changes of entities**
    - Explanation: Events in Spring Data REST are used to hook into the lifecycle of entities, allowing custom logic to be executed at various points, such as before or after saving an entity.

11. **A. `BeforeCreateEvent`**
    - Explanation: `BeforeCreateEvent` is an example of a Spring Data REST lifecycle event, triggered before a new entity is created and saved.

#### HAL and HATEOAS
12. **B. Hypertext Application Language**
    - Explanation: HAL (Hypertext Application Language) is a simple format that gives a consistent and easy way to hyperlink between resources in API.

13. **A. To provide a way to navigate REST APIs through hyperlinks**
    - Explanation: HATEOAS (Hypermedia as the Engine of Application State) is a constraint of REST application architecture that keeps the RESTful style architecture unique from most other network application architectures.

#### ALPS
14. **A. Application Level Profile Semantics**
    - Explanation: ALPS is a data format used to describe the semantics of data and interactions in a RESTful API, providing a way to understand the API's capabilities and data structures.

15. **A. To provide metadata about the API’s data structures and capabilities**
    - Explanation: ALPS is used in Spring Data REST to describe the semantics and capabilities of the API, offering a machine-readable format for API metadata.

#### Entity Modelling
16. **A. A Java class that represents a database table**
    - Explanation: In Spring Data REST, an entity is a Java class annotated with `@Entity`, representing a table in a database where each instance of the class corresponds to a row in the table.

17. **A. `@Entity`**
    - Explanation: The `@Entity` annotation is used to mark a Java class as an entity, which means it is bound to a database table.
