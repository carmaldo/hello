package com.example.hello;



import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class HelloApplication {

	public static void main(String[] args) {
		log.info("HELLO WORLD");
		SpringApplication.run(HelloApplication.class, args);
	}


}
