package org.example.aichatbotrag;

import org.example.aichatbotrag.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class AiChatbotRagApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiChatbotRagApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
				for (int i = 0; i < 100; i++) {
					Person person = Person.builder()
							.name(UUID.randomUUID().toString().substring(0, 8))
							.email(UUID.randomUUID().toString().substring(0, 8)+"gmail@.com")
							.build();
//					personRepository.save(person);
				}
		};
	}
}
