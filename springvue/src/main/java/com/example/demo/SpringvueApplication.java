package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "repository")
public class SpringvueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringvueApplication.class, args);
	}

}
