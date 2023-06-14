package consuming.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// Run app by using ./mvnw spring-boot:run

/* Can also build JAR file w/ ./mvnw clean package
 Then run java -jar target/gs-consuming-rest-0.1.0.jar */

@SpringBootApplication
public class DemoConsumeRestApplication {

	// Logger sends output to the console
	public static final Logger log = LoggerFactory.getLogger(DemoConsumeRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumeRestApplication.class, args);
	}

	@Bean
	// RestTemplate uses jackson JSON library for data processing
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build()
;	}

	@Bean
	// CommandLineRunner runs the RestTemplate on startup
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
							"http://localhost:8080/api/", Quote.class);
			log.info(quote.toString());
		};
	}

}
