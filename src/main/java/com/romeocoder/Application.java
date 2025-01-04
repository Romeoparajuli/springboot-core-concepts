package com.romeocoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Application class is the entry point of the Spring Boot application. It
 * implements the CommandLineRunner interface to execute custom logic during the
 * application startup.
 */
@SpringBootApplication
public class Application {

    /**
     * The main method serves as the starting point of the Spring Boot application.
     * It initializes the Spring application context and launches the application.
     *
     * 
     */
    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }

}

// Alternative implementation of the Application class
/*
 * public class Application implements CommandLineRunner {
 * 
 * // The main method is the entry point of the Java application. // Spring Boot
 * uses this method to bootstrap the application. public static void
 * main(String[] args) { // SpringApplication.run() initializes the Spring
 * application context. // It sets up the entire Spring Boot application and
 * makes beans available. SpringApplication.run(Application.class, args); }
 * 
 * // The run method is part of the CommandLineRunner interface. // It gets
 * executed automatically after the Spring application context is fully
 * initialized.
 * 
 * @Override public void run(String... args) throws Exception { // Invoking the
 * printMessage method from the MyClass bean // with the argument
 * "Milan Parajuli". // This demonstrates how a bean can be used during
 * application startup. myClass().printMessage("Milan Parajuli"); }
 * 
 * // Defining a Spring-managed bean of type MyClass. // The @Bean annotation
 * tells Spring that this method returns a bean to be managed. // Beans are
 * reusable components that can be injected or used throughout the application.
 * 
 * @Bean private MyClass myClass() { // Returning a new instance of MyClass. //
 * This instance is registered in the Spring context and available for
 * dependency injection. return new MyClass(); } }
 */
