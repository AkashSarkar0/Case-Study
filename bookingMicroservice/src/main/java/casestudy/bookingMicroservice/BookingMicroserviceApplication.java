package casestudy.bookingMicroservice;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition
@EnableEurekaClient
@SpringBootApplication
public class BookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroserviceApplication.class, args);
	}
	@Bean
	public GroupedOpenApi swaggerConfig() {
		return GroupedOpenApi.builder()
			.group("casestudy")
			.pathsToMatch("/booking/**")
			.build();
	}

	@Bean
	public OpenAPI swaggerApiInfoConfig(){
		return new OpenAPI()
		.info(new Info()
		.title("Train Reservation and management")
		.description("User Booking Management Application")
		.version("v0.0.7")
		.license(new License().name("GitHub").url("https://github.com/AkashSarkar0")));
	}

/*	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	} */
}
