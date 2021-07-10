package com.gdg.group15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Group15Application {

	public static void main(String[] args) {
		SpringApplication.run(Group15Application.class, args);
	}

}
