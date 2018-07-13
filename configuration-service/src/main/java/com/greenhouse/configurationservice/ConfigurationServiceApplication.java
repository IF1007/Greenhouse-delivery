package com.greenhouse.configurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServiceApplication.class, args);
	}
}
