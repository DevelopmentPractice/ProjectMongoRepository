package edu.development.practice.mongo.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "edu.development.practice.mongo.repository.repository")
public class MongoRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRepositoryApplication.class, args);
	}

}
