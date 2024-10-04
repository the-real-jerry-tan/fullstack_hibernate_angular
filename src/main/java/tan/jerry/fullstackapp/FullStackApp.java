
/*
 * Copyright (c) 2024 Jerry Tan. All rights reserved.
 * 
 * This is a full-stack web application demonstrating the use of Spring Boot and Hibernate for the backend and Angular for the frontend.
 * The backend uses Hibernate for ORM and database persistence.
 */

package tan.jerry.fullstackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FullStackApp {

    public static void main(String[] args) {
        SpringApplication.run(FullStackApp.class, args);
    }
}

/**
 * A REST controller to expose backend endpoints.
 */
@RestController
class FullStackController {

    /**
     * Get a message from the backend.
     * @return A welcome message.
     */
    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to the Full-Stack Application!";
    }
}
