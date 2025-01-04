package com.romeocoder.Config;

// Import necessary Spring Boot and custom packages
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.romeocoder.Bean.Student;

/**
 * AppConfiguration class is a Spring configuration class 
 * that defines beans and application startup logic.
 * 
 * This class configures Spring beans using @Bean annotation 
 * and provides a CommandLineRunner to execute custom logic 
 * when the application starts.
 */
@Configuration
public class AppConfiguration {
    
    /**
     * CommandLineRunner bean is used to execute code at the time of application startup.
     * This runner displays the details of two Student objects defined as beans.
     *
     * @return an instance of CommandLineRunner
     */
    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            
            /**
             * The run method is the entry point for CommandLineRunner. It is executed at application startup.
             *
             * @param args command-line arguments passed to the application
             * @throws Exception in case of errors during execution
             */
            @Override
            public void run(String... args) throws Exception {
                // Print a separator for clarity in console output
                System.err.println("***************");
                
                // Display details of the first student bean
                studentDetailsBean().displayStudentDetails();
                
                // Print another separator for clarity
                System.err.println("_______________________");
                
                // Display details of the second student bean
                studentDetailsBean2().displayStudentDetails();
            }
        };
    }
    
    /**
     * Defines the first Student bean with predefined details.
     *
     * @return an instance of Student with specific details
     */
    @Bean
    public Student studentDetailsBean() {
        return new Student("Milan Parajuli", 3030, 80); // Student's name, roll number, and score
    }

    /**
     * Defines the second Student bean with predefined details.
     *
     * @return an instance of Student with specific details
     */
    @Bean
    public Student studentDetailsBean2() {
        return new Student("Shisir Parajuli", 3031, 60); // Student's name, roll number, and score
    }

    // Commented out code example demonstrating additional functionality
    /*
    /**
     * The run method could also invoke methods from a MyClass bean.
     * 
     * @param args command-line arguments passed to the application
     * @throws Exception in case of errors during execution
     */
    /*
    @Override
    public void run(String... args) throws Exception {
        myClass().printMessage("Milan Parajuli");
    }

    /**
     * Defines a MyClass bean with custom methods.
     *
     * @return an instance of MyClass
     */
    /*
    @Bean
    private MyClass myClass() {
        return new MyClass();
    }
    */
}
