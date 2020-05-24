package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAngularDemoOktaApplication {

	@GetMapping("/")
    public String echoTheUsersEmailAddress(Principal principle) {
        return "Welcome after OKTA Authentication "+principle.getName();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularDemoOktaApplication.class, args);
	}
	
	 

}
