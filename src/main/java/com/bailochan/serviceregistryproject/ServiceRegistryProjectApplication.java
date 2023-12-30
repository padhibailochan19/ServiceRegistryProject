package com.bailochan.serviceregistryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryProjectApplication.class, args);
	}

}
