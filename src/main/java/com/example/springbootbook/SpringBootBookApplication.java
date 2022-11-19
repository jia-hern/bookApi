package com.example.springbootbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookApplication.class, args);
	}

}
