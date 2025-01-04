package com.romeocoder.controler;

// Importing necessary Spring Framework annotations and classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This class is a Spring MVC Controller that handles HTTP requests.
 * It is part of the `com.romeocoder.controler` package.
 * 
 * The controller defines endpoints that process client requests and return responses.
 */
@Controller
public class MyController {

    /**
     * Handles HTTP GET requests to the root ("/") URL.
     * 
     * - The @GetMapping annotation maps this method to handle GET requests at "/".
     * - The @ResponseBody annotation ensures the return value is written directly
     *   to the HTTP response body instead of being interpreted as a view name.
     *
     * @return A simple "Hello from Spring Boot" message as plain text.
     */
    @GetMapping("/") // Maps HTTP GET requests to the root URL "/"
    @ResponseBody // Indicates that the return value should be sent as a response body
    public String printHello() {
        // Returns a simple greeting message as the HTTP response
        return "hello from springBoot you are in brouser";
    }
}
