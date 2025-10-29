// Defines the base package for the application. Spring Boot's component scanning will look for beans (like Controllers, Services, Repositories) in this package and its sub-packages.
// Package definition is necessary for @ComponentScan to enable Spring runtime environment to find sub-package controller.
package io.github.femtowatts.backend_parking_reservation;

// Imports the main class for running a Spring application and the core configuration annotation.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Spring Boot application.
 */
@SpringBootApplication
// This is the core annotation. It combines three essential Spring annotations:
// 1. @Configuration: Tags the class as a source of bean definitions.
// 2. @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings (e.g., adding Tomcat if spring-boot-starter-web is present).
// 3. @ComponentScan: Scans the current package and its sub-packages for components (like @RestController, @Service, etc.).
public class ParkingReservationApplication {

	// The main method that uses Spring Boot's static 'run' method to launch the application.
	// It delegates to Spring Boot, which initializes the application context, performs component scanning, and starts the embedded server (e.g., Tomcat).
	public static void main(String[] args) {
		
		SpringApplication.run(ParkingReservationApplication.class, args);
	}

}