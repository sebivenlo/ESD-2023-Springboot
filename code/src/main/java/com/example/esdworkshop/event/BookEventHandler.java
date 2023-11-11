package com.example.esdworkshop.event;


import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for handling events related to books. It is annotated with @Component and @RepositoryEventHandler
 * to indicate that it is a Spring bean and an event handler for repository events, respectively.
 */
@Component
@RepositoryEventHandler
public class BookEventHandler {
    // bonus todo: implement HandleBeforeCreate and HandleBeforeSave events
}
