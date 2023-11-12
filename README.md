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

### How does Spring Data REST compare to other frameworks?

| Framework                             | Spring                                                                         | Django                                                                                      | Flask                                                                                                                              | Micronaut                                                                                                                           | Fast API                                                                                                                  | Express                                                                                                   |
|---------------------------------------|--------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| **Language**                          | Java, Kotlin                                                                   | Python                                                                                      | Python                                                                                                                             | Pyhton                                                                                                                              | Python                                                                                                                    | JavaScript                                                                                                |
| **Ease of Use**                       | Simplified, conventions-over-configurations, opinionated framework             | Known for its "batteries-included" philosophy.                                              | Lightweight, flexible framework comes without any dependencies                                                                     | Best known for at compile time dependency injection mechanism that results in faster application setup and smaller memory footprint | Known for its intuitive syntax and Pythonic nature.                                                                       | Lightweight and minimal, offering great flexibility.                                                      |
| **Community and Documentation**       | Strong and active community, robust documentation.                             | Extensive documentation, active community.                                                  | Extensive documentation and active community                                                                                       | Growing popularity and user base with good documentation available                                                                  | Growing community due to its recent surge in popularity.                                                                  | Large and active community given its association with Node.js.                                            |
| **Security**                          | Wide range of security features, robust security for enterprise applications.  | Provides out-of-the-box support for many security features.                                 | Built in security features for common threads and secure cookies                                                                   | Offers standard security features and supports OAuth2                                                                               | Provides security utilities directly, including OAuth2 password flow and scopes.                                          | Relies on middleware like Helmet and Passport for security.                                               |
| **REST API**                          | Easily exposes data models via REST.                                           | Great flexibility in designing APIs, provides functionalities like serialization.           | Simple to develop because the application will be lightweight and flexible                                                         | Very flexible and performant with features like provided serilization                                                               | Asynchronous support offers performance advantages.                                                                       | Offers flexibility in defining endpoints and HTTP methods.                                                |
| **Scalability**                       | Excellent scalability.                                                         | Relatively lightweight, scalable.                                                           | Offers flexibility to expand the application quickly                                                                               | Is designed to be scalable and be very performant at the same time                                                                  | Asynchronous capabilities ensure efficient handling of I/O bound operations.                                              | Being lightweight, it’s highly scalable with the right configurations.                                    |
| **Database Support**                  | Powerful ORM with JPA, supports a wide range of databases.                     | High-level, easy-to-use ORM.                                                                | Comes with SQLAlchemyAdaport which supports many SQL databases                                                                     | Micronaut Data is based on JPA. Offers wide variety of database support                                                             | ORM agnostic but has good community support for SQLAlchemy and Tortoise-ORM.                                              | Uses ORM tools like Sequelize or Mongoose for MongoDB.                                                    |
| **Development Speed**                 | Accelerates development speed for standard applications.                       | Facilitates rapid development due to simplicity.                                            | Fast debugger, easily scalable and simple to develop. Little code required                                                         | Easily testable and modular with fast startup time                                                                                  | Rapid development due to intuitive design.                                                                                | Enables rapid development given its minimalistic nature.                                                  |
| **Testing**                           | Provides a strong testing framework, supporting various testing methodologies. | Offers a user-friendly testing framework.                                                   | Allows for unit testing through its integrated support, built-in development server, fast debugger and restful request dispatching | Offers integrated testing framework that includes capabilities like dependency injection in tests and simple bean mocking           | Easy testing based on Python’s pytest.                                                                                    | Utilizes libraries like Mocha, Chai, and Jest for testing.                                                |
| **HATEAOS**                           | Adheres to HATEOAS, facilitating API discoverability and evolution.            | Developers have flexibility to design APIs as per requirements.                             | API’s are coherent and neat. Strong WSGI support                                                                                   | Quickly maturing framework                                                                                                          | Does not have built-in HATEOAS support.                                                                                   | HATEOAS can be implemented, but it’s manual and relies on third-party libraries.                          |
| **Automated API Exposure**            | Automatically exposes model repositories as HTTP endpoints.                    | Automatically exposes model repositories as HTTP endpoints.                                 | Enables exposure of Python functions as API’s                                                                                      | Uses controllers to expose Rest API’s                                                                                               | Requires manual endpoint definition, but offers flexibility.                                                              | No automatic exposure; developers define what gets exposed.                                               |
| **Data Validation and Serialization** | Automatically handles serialization/deserialization.                           | Provides robust and flexible serialization framework.                                       | Flexible serialisation that is easily implemented                                                                                  | Supports Jackson Databind and its own Micronaut Serialisation.                                                                      | Utilizes Pydantic for data validation and serialization, providing automatic error handling                               | Utilizes middleware like express-validator for validation.                                                |
| **Integration with Front-End**        | Can be seamlessly integrated with various front-end frameworks.                | DRF-YASG and drf-spectacular enable easy API consumption from various front-end frameworks. | Integrated template engine                                                                                                         | Supports multiple template engines and security features                                                                            | With its built-in interactive docs (based on OpenAPI), it's frontend-agnostic and integrates well with modern frameworks. | Easily integrates with JavaScript-based frameworks like React, Vue, and Angular due to its JS foundation. |
| **Microservices Architecture**        | Aligns well with microservices architecture and is considered cloud-native.    | Simpler to set up for smaller applications or microservices.                                | Is lightweight and comes with built-in extensions that make it very suitable for microservices                                     | Little memory usage, fast startup times and support for distributed tracing                                                         | Lightweight nature makes it suitable for microservices. Easily containerized.                                             | Works well with Docker and Kubernetes for microservices orchestration.                                    |

Ultimately, the choice between frameworks depends on factors such as the programming language, existing technology
stack, project requirements, and team expertise.

Spring Data REST is a strong choice for Java developers working within the Spring ecosystem and seeking a streamlined
approach to building RESTful APIs with minimal boilerplate code.

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

- Entity Modelling (https://spring.io/guides/gs/accessing-data-jpa/)
- Repositories (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources)
- Search
  parameters (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.search-resource)
- Querying (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.query-method-resource)
- Paging/Sorting (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#paging-and-sorting)
- Projections (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#projections-excerpts)
- Validation (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#validation)
- Events (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#events)
- HAL & HATEOAS (https://en.wikipedia.org/wiki/HATEOAS)
- ALPS (https://docs.spring.io/spring-data/rest/docs/current/reference/html/#metadata)

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

#### FastAPI

- https://fastapi.tiangolo.com/tutorial/path-params/
- https://fastapi.tiangolo.com/tutorial/first-steps/#interactive-api-docs
- https://fastapi.tiangolo.com/tutorial/security/
- https://fastapi.tiangolo.com/tutorial/path-params-numeric-validations/
- https://fastapi.tiangolo.com/#performance
- https://fastapi.tiangolo.com/tutorial/sql-databases/
- https://fastapi.tiangolo.com/tutorial/testing/
- https://fastapi.tiangolo.com/tutorial/body/
