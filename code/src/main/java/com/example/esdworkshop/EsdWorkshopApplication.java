package com.example.esdworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The {@code EsdWorkshopApplication} class is the entry point of the ESD Workshop application.
 * The application is built using Spring Boot and is annotated with {@link SpringBootApplication SpringBootApplication}
 * to enable autoconfiguration and component scanning.
 */
@SpringBootApplication
public class EsdWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsdWorkshopApplication.class, args);
    }

}
