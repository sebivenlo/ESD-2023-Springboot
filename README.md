# Spring Data Rest Workshop

## Table of Contents

1. [Assignment](#assignment)
2. [Detailed Research about Spring Data Rest](#detailed-research-about-spring-data-rest)
3. [Introduction to Spring Data Rest](#introduction-to-spring-data-rest)
4. [When and Why should you use Spring Data REST?](#when-and-why-should-you-use-spring-data-rest)
5. [Comparison between other Frameworks](#comparison-to-other-frameworks)
6. [Core Concepts](#core-concepts)
7. [References](#references)

### Assignment

A link to the assignment can be found [here](code/assignment.md).

### Detailed Research about Spring Data Rest

Our detailed research about the finer details of Spring Data Rest is
available [here.](/research/spring_breakdown/README.md)

### Introduction to Spring Data REST

In the landscape of modern web applications,
creating robust and efficient RESTful APIs is a cornerstone of successful development.
Spring Data REST, a pivotal component of the Spring ecosystem, steps in to streamline this process,
allowing developers to focus on their data models and business logic rather than the intricacies of API implementation.

### When and Why should you use Spring Data REST?

1. Rapid API Development
    - When to Use: When you need to quickly expose CRUD operations on data models without manual controller code.
    - Why: Spring Data REST automates RESTful endpoint creation, allowing faster development with minimal boilerplate.
2. Reducing Boilerplate Code:
    - When to Use: When you want to minimize manual setup and maintenance of RESTful APIs.
    - Why: Spring Data REST eliminates the need for explicit controller code, reducing development effort and improving
      code maintainability.
3. Data-Centric Applications:
    - When to Use: For applications focused on data storage and retrieval.
    - Why: Spring Data REST seamlessly integrates with Spring Data repositories, making it well-suited for data-centric
      applications.
4. Resource Discoverability and HATEOAS:
    - When to Use: When API discoverability and adherence to HATEOAS principles are crucial.
    - Why: Spring Data REST includes hyperlinks in responses, enabling dynamic resource navigation for clients.
5. Consistency with Spring Ecosystem:
    - When to Use: When maintaining consistency within the Spring ecosystem is essential.
    - Why: Spring Data REST integrates seamlessly with other Spring projects, ensuring a cohesive development experience
      for Spring developers.

### Comparison to other Frameworks

The choice between frameworks depends on factors such as the programming language, existing technology stack, project
requirements, and team expertise. Spring Data REST is a strong choice for Java developers working within the Spring
ecosystem and seeking a streamlined approach to building RESTful APIs with minimal boilerplate code.

A detailed comparison can be found [here.](/research/comparison/README.md)

### Core Concepts

#### Entity Modelling

- Class Definition
    - With annotation: @Entity
    - Java class

#### Repositories

- Used to export resources and automatically create endpoints
- Different Repository Interfaces (CRUD, JPA, PagingAndSorting, etc.)
- Custom query support

#### Annotations

- Provide metadata and configuration
- Therefore, control various aspects of how REST API is exposed and entities are handled
- Common annotations include
    - @Entity
    - @Service
- Helpful packages can extend features of annotations
    - Lombok, Jakarta, etc.

#### Querying

- Dynamic Query Creation
- Support for query parameters
- Support for named queries
- Interoperability with projections

#### Projections

- Interface- or Class-based
- Defined using the @Projection annotation
- Support for selective Data Exposure
- Nested Projections
- Support for lazy loading and query optimization

#### Validation

- Used to validate entities
- Marker Annotation Support (@NotNull, @NotEmpty, etc.)
- Support for cascade validation (@Valid)
- Error handling with @ControllerAdvice

#### Events

- Entity Lifecycle Events (@PrePersist, @PostLoad)
- Repository Events (@BeforeCreate, @AfterSave, etc.)
- Annotation Driven with Event Classes
- Support for conditional Events

#### HATEAOS

- Resource Representation
- Model Conversion
- Dynamic Link Creation
- Affordances
- HAL Format compliant

#### ALPS

- Semantic Descriptor Profiles
- Support for Descriptor Types
- Automatic Documentation Integration
- Extendable

### References

- [Entity Modelling](https://spring.io/guides/gs/accessing-data-jpa/)
- [Repositories](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources)
- [Search parameters](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.search-resource)
- [Querying](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.query-method-resource)
- [Paging/Sorting](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#paging-and-sorting)
- [Projections](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#projections-excerpts)
- [Validation](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#validation)
- [Events](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#events)
- [HAL & HATEOAS](https://en.wikipedia.org/wiki/HATEOAS)
- [ALPS](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#metadata)
