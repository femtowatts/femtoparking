// Original (incorrect) package line. It's commented out because the controller class must reside in a package you control.
//package org.springframework.web.bind.annotation;

// Defines the package for this controller, placing it as a sub-package of the main application's base package (io.github.femtowatts.backend_parking_reservation), which ensures it is automatically found and scanned by Spring Boot.
// Enables Spring runtime environment using @ComponentScan feature to find HelloController.java.
package io.github.femtowatts.backend_parking_reservation.controller;

import org.springframework.web.bind.annotation.GetMapping; // Imports the pre-defined annotation used to map HTTP GET requests.
import org.springframework.web.bind.annotation.RestController; // Imports the pre-defined annotation that marks this class as a REST controller.

/**
 * Controller class to handle simple HTTP requests for the REST API.
 */
@RestController // Annotation that marks this class as a REST Controller. It is a convenience annotation that combines @Controller and @ResponseBody.
public class HelloController {

    /**
     * Maps HTTP GET requests to the "/api/hello" endpoint.
     * @return A simple String response that will be sent directly as the HTTP response body (due to @RestController).
     */
    @GetMapping("/api/hello")
    // Annotation that maps HTTP GET requests specifically to the URI path "/api/hello".
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

}