package com.vicky.testuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class TestUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestUserApplication.class, args);
	}
	
	@GetMapping("/testUser")
	public String testUser() {
		return "testing User Service";
	}

}
