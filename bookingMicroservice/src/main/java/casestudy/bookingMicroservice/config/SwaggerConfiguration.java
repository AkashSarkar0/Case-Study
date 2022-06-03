package casestudy.bookingMicroservice.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfiguration {
	@Bean
	public Docket productApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("casestudy.bookingMicroservice"))
				.paths(PathSelectors.any())
				.build()
		        .apiInfo(getApiDetails());
	}
	
	private ApiInfo getApiDetails() {
		return new ApiInfo(
				"Booking API Documentation and Details",
				"API for Train Booking management Microservice",
				"1.0",
				"Free",
				new springfox.documentation.service.Contact("Akash", "http://Youtube.com", "akash23sarkar2000@gmail.com"),
				"API Licence",
				"http://Youtube.com",
				Collections.emptyList());
    }
}
