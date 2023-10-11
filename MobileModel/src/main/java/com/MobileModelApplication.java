package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.mobilemodel.entity")
public class MobileModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileModelApplication.class, args);
	}

}
