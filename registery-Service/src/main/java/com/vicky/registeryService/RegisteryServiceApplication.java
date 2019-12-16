package com.vicky.registeryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableEurekaServer
@EnableAdminServer
@SpringBootApplication
public class RegisteryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisteryServiceApplication.class, args);
	}

}
