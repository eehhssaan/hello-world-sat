package com.example.hello.world.sat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldSatApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSatApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Welcome Home";
	}

}
