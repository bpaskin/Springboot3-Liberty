package com.ibm.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.example.rest.Hello;

@SpringBootApplication
@ComponentScan(basePackageClasses =Hello.class)
public class ExampleApp {

	public static void main(String... args) {
		SpringApplication.run(ExampleApp.class, args);
	}
}
