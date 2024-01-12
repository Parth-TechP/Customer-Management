package com.example.customerManagenment.customerManagenment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Customer Management Application",
				version = "1.0",
				description = "This Project uses REST API, PostgreSQL, JPA and Swagger UI",
				termsOfService = "demoCode",
				contact = @Contact(
						name = "Parth Shah",
						email = "parth.shah@techpresci8594358979ent.com"
				),
				license = @License(
						name = "License",
						url = "demoCode"
				)
		)
)
public class CustomerManagenmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagenmentApplication.class, args);
	}

}
