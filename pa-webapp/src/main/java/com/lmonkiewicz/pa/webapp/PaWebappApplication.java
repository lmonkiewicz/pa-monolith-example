package com.lmonkiewicz.pa.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lmonkiewicz.pa")
public class PaWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaWebappApplication.class, args);
	}
}
