package com.akshay.microdemodeptservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroDemoDeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDemoDeptServiceApplication.class, args);
	}

}
