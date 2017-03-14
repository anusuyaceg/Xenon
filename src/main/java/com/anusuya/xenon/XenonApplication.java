package com.anusuya.xenon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XenonApplication {

	public static void main(String[] args) {
		SpringApplication.run(XenonApplication.class, args);
		System.out.println("Starting Xenon Application");
	}
}
