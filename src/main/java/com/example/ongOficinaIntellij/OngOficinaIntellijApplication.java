package com.example.ongOficinaIntellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.example.ongOficinaIntellij.login")
@EntityScan(basePackages = "com.example.ongOficinaIntellij.login")

public class OngOficinaIntellijApplication {

	public static void main(String[] args) {
		SpringApplication.run(OngOficinaIntellijApplication.class, args);
	}

}
