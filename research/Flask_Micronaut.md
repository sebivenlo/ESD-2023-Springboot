FLASK & Micronaut

1. Ease of Use 
    * Flask
        * Pros: is a lightweight framework that offers flexibility for developers to experiment with their modules or architectures but doesn’t require any particular tools or libraries 
        * Cons: Libraries must be manually installed 
    * Micronaut
        * Pros: Best known for at compile time dependency injection mechanism that results in faster application setup and smaller memory footprint
        * Cons: More complex to implement than other frameworks
2. Community and Documentation 
    * Flask
        * Pros: Extensive documentation and active community 
        * Cons: some frameworks offer a larger community 
    * Micronaut
        * Pros: Growing popularity and user base with good documentation available 
        * Cons: Smaller community and ecosystem 
3. Security 
    * Flask
        * Pros: Built in security features for common threads and secure cookies
        * Cons: Using more modules could be a major breach in security 
    * Micronaut
        * Pros: Offers standard security. Features and supports OAuth2
        * Cons: Some configuration required
4. Rest API development 
    * Flask
        * Pros: Simple to develop because the application will be lightweight and flexible 
        * Cons: Won’t make decisions for the developer, like choosing a database or template engine 
    * Micronaut
        * Pros: Very flexible and performant with features like provided serilization
        * Cons: Not as straight forward as other framework
5. Scalability
    * Flask
        * Pros: Offers flexibility to expand the application quickly 
        * Cons: has singular source meaning it can only handle requests in turns, one at a time. Therefore, it could slow down with scale
    * Micronaut
        * Pros: Is designed to be scalable and be very performant at the same time
        * Cons: Less maturity than other frameworks could cause issues
6. Database Support and ORM
    * Flask
        * Pros: comes with SQLAlchemyAdaport which supports many SQL databases
        * Cons: doesn’t offer a database management system or ORM
    * Micronaut
        * Pros: Micronaut Data is based on JPA. Offers wide variety of database support 
        * Cons: Relatively complex configuration 
7. Development Speed 
    * Flask
        * Pros: Fast debugger, easily scalable and simple to develop. Little code required
        * Cons: best suited for only smaller projects. Libraries must be manually installed
    * Micronaut
        * Pros: Easily testable and modular with fast startup time
        * Cons: Smaller community and less robust framework
8. Testing
    * Flask
        * Pros: allows for unit testing through its integrated support, built-in development server, fast debugger and restful request dispatching 
    * Micronaut
        * Pros: offers integrated testing framework that includes capabilities like dependency injection in tests and simple bean mocking 
9. API maturity and HATEOAS Compliance
    * Flask
        * Pros: API’s are coherent and neat. Strong WSGI support 
        * Cons: No HATEOS compliance 
    * Micronaut
        * Pros: Quickly maturing framework
        * Cons: Manual work required to make Micronaut HTEOAS+HAL compliant
10. Automated API Exposure 
    * Flask
        * Pros: Enables exposure of Python functions as API’s
    * Micronaut
        * Pros: Uses controllers to expose Rest API’s
11. Data Validation and Serialisation 
    * Flask
        * Pros: Flexible serialisation that is easily implemented 
        * Cons: Can become more complex if custom serialisation is needed
    * Micronaut
        * Pros: Supports Jackson Databind and its own Micronaut Serialisation. 
        * Cons: While it is flexible some extra configuration is required
12. Integration with Front-end Frameworks
    * Flask
        * Pros: integrated template engine
        * Cons: Dynamic HTML pages are not supported by flask
    * Micronout
        * Pros: Supports multiple template engines and security features
        * Cons: Manual configuration is required 
13. Microservices Architecture 
    * Flask
        * Pros: Is lightweight and comes with built-in extensions that make it very suitable for micro services
    * Micronout
        * Pros: little memory usage, fast startup times and support for distributed tracing 


### References 

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
