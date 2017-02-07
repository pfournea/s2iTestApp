package be.openshift.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S2iTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(S2iTestAppApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
