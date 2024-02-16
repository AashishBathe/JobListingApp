package com.aashish.joblisting;

import com.aashish.joblisting.repository.SearchRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class JoblistingApplication {
	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

}
