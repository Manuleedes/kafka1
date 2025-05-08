package com.Lidigu.Kafka2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Kafka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka2Application.class, args);
	}
	@Bean
CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("leedes","my club is Chelsea");
		};
}
}
