# ESD template

Please make sure all artifacts are in this GitHub repository.  
That includes:

- Code
- Workshop materials
- Presentation (if applicable)
- References.
- Docker (compose) file (if applicable)


### Introduction into Spring Data REST

In the landscape of modern web applications,
creating robust and efficient RESTful APIs is a cornerstone of successful development.
Spring Data REST, a pivotal component of the Spring ecosystem, steps in to streamline this process,
allowing developers to focus on their data models and business logic rather than the intricacies of API implementation.

### Prerequisites

The prerequisites...

### When and Why should you use Spring Data REST?

1.When to Use: When you need to quickly expose CRUD operations on data models without manual controller code.
2.Why: Spring Data REST automates RESTful endpoint creation, allowing faster development with minimal boilerplate.
1.Reducing Boilerplate Code:
1.When to Use: When you want to minimize manual setup and maintenance of RESTful APIs.
2.Why: Spring Data REST eliminates the need for explicit controller code, reducing development effort and improving code maintainability.
2.Data-Centric Applications:
1.When to Use: For applications focused on data storage and retrieval.
2.Why: Spring Data REST seamlessly integrates with Spring Data repositories, making it well-suited for data-centric applications.
3.Resource Discoverability and HATEOAS:
1.When to Use: When API discoverability and adherence to HATEOAS principles are crucial.
2.Why: Spring Data REST includes hyperlinks in responses, enabling dynamic resource navigation for clients.
4.Consistency with Spring Ecosystem:
1.When to Use: When maintaining consistency within the Spring ecosystem is essential.
2.Why: Spring Data REST integrates seamlessly with other Spring projects, ensuring a cohesive development experience for Spring developers.


### How does Spring Data REST compare to other frameworks?


| Framework                       | Spring | Micronaut | Flask  | Django | Fast API |
|---------------------------------|--------|-----------|--------|--------|----------|
| **Language**                    | Java   | Java      | Python | Pyhton | Java     |
| **Ease of Use**                 | tt     | tt        | tt     | tt     | tt       |
| **Community and Documentation** | tt     | tt        | tt     | t      | tt       |
| **Security**                    | tt     | tt        | tt     | tt     | tt       |
| **REST API**                    | tt     | tt        | tt     | tt     | tt       |
| **Scalability**                 | tt     | tt        | tt     | tt     | tttt     |
| **Database Support**            | tt     | tt        | tt     | tt     | tt       |


Ultimately, the choice between frameworks depends on factors such as the programming language, existing technology stack, project requirements, and team expertise. 

Spring Data REST is a strong choice for Java developers working within the Spring ecosystem and seeking a streamlined approach to building RESTful APIs with minimal boilerplate code.


### Core Concepts

#### Entity Modelling
- Class Definition
  - With annotation: @Entity
  - Java class

#### Repositories 
- Used to export resources and automatically create endpoints
- Different Repository Interfaces (CRUD, JPA, PagingAndSprting, etc.)
- Custom query support

#### Annotations
- Provide metadata and configuration
- Therefore, control various aspects of how REST API is exposed and entities are handled
- Common annotations include 
  - public interface BookRepository extends CcrudRepository<Book, Long>
  - @Entity
  - @Service
- Helpful packages can extend features of annotations
  - Lombok, Jarkarta, etc.

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

### Additional Resources
- Repositories (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources)
- Search parameters (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.search-resource)
- Querying (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.query-method-resource)
- Paging/Sorting (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#paging-and-sorting)
- Projections (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#projections-excerpts)
- Validation (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#validation)
- Events (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#events)
- HAL und HATEOAS (https://en.wikipedia.org/wiki/HATEOAS)
- ALPS (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#metadata)
- Entity Modelling: Wie erstelle ich eine Entity, etc. (https://spring.io/guides/gs/accessing-data-jpa/)


### References 

#### Django 
- https://spring.io/guides
- https://docs.djangoproject.com/en/4.2/
- https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference
- https://www.django-rest-framework.org/
- https://spring.io/projects/spring-security
- https://docs.djangoproject.com/en/3.2/topics/security/
- https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
- https://docs.djangoproject.com/en/3.2/topics/db/models/
- https://spring.io/guides/gs/testing-web/
- https://docs.djangoproject.com/en/3.2/topics/testing/
- https://en.wikipedia.org/wiki/HATEOAS
- https://spring.io/projects/spring-hateoas
- https://www.django-rest-framework.org/topics/rest-hypermedia-hateoas/
- https://docs.spring.io/spring-data/rest/docs/current/reference/html/#validation
- https://www.django-rest-framework.org/api-guide/serializers/
- https://spring.io/projects/spring-cloud

#### Express

- https://spring.io/projects/spring-boot
- http://expressjs.com/
- https://example-reference-link.com
- https://example-reference-link.com

#### Flask

- https://en.wikipedia.org/wiki/Flask_(web_framework)
- https://flask.palletsprojects.com/en/3.0.x/
- https://www.mygreatlearning.com/blog/flask-vs-django/
- https://dev.to/detimo/python-flask-pros-and-cons-1mlo
- https://auth0.com/blog/developing-restful-apis-with-python-and-flask/

#### Micronaut

- https://www.baeldung.com/micronaut
- https://blog.doubleslash.de/vergleich-spring-boot-vs-micronaut-vs-quarkus
- https://walkingtreetech.medium.com/micronaut-the-potential-poster-boy-for-microservices-7c9a008b1e57
- https://www.linkedin.com/pulse/micronaut-vs-spring-boot-which-choose-detailed-carolin-winsey/
- https://walkingtreetech.medium.com/spring-boot-vs-micronaut-the-battle-unleashed-2682354a88e9
- https://guides.micronaut.io/latest/micronaut-data-jdbc-repository-gradle-java.html
- https://micronaut-projects.github.io/micronaut-serialization/latest/guide/
- https://espeo.eu/blog/micronaut-vs-springboot/
