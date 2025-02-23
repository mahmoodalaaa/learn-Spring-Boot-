package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(value = "/")
	public String hallo(){
		return "Hallo World !!!";
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRespsitory studentRespsitory){
		return args -> {
			// Student mahmood= new Student("mahmood",);
			// studentRespsitory.save(mahmood);
			System.out.println("Reddy");
		};
	}
}
