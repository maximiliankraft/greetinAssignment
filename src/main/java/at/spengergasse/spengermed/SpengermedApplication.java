package at.spengergasse.spengermed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


// prevent global 401 response
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpengermedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpengermedApplication.class, args);
	}
}
