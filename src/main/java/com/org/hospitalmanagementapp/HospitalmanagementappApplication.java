package com.org.hospitalmanagementapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
		info = @Info(
				title = "Hospital Management Application",
				version = "v1",
				description = "This application manage Doctor and Patient tracking system",
				termsOfService = "All service reserved under Sucheta Biswas"
		)
)
@SpringBootApplication
public class HospitalmanagementappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalmanagementappApplication.class, args);
	}

}
