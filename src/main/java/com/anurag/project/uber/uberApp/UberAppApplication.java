package com.anurag.project.uber.uberApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberAppApplication.class, args);
	}

}
