package com.example.early.initialisation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EarlyInitialisationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarlyInitialisationApplication.class, args);

		// Get the instance of SingletonEager
		SingletonEager singleton = SingletonEager.getInstance();

		// Use the instance
		singleton.doSomething();
	}
}

