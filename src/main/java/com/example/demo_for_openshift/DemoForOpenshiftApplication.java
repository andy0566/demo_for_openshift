package com.example.demo_for_openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoForOpenshiftApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoForOpenshiftApplication.class, args);
    }

}
