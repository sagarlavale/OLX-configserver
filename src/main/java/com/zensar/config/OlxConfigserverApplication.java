package com.zensar.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OlxConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxConfigserverApplication.class, args);
	}

}
