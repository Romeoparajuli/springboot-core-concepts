package com.romeocoder;

// Importing Spring Framework's @Component annotation
import org.springframework.stereotype.Component;

/**
 * This class represents a simple Spring component that provides a utility method
 * to print a personalized message to the console.
 * 
 * The class is annotated with @Component, making it a Spring-managed bean. It
 * can be autowired and used wherever needed within the application context.
 */
@Component
public class MyClass {

    /**
     * Prints a personalized greeting message to the error output stream (console).
     *
     * @param name - The name to be included in the greeting message.
     *               It is expected to be a non-null string.
     */
    public void printMessage(String name) {
        // Logs a greeting message with the provided name to the error stream
        System.err.println("hello: " + name);
    }
}
