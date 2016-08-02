package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Openshiftdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Openshiftdemo2Application.class, args);
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "pong";
	}
}
