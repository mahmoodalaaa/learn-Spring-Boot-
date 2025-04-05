package com.example.Jba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class JbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbaApplication.class, args);
	}

	@GetMapping("/")
	public String Hello () {
		return "Hello World!";
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return _ -> {
			System.out.println("The App ist Redy to use at http://localhost:8080/");
			
		};
	}
}
