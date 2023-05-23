package com.task.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories 
public class CassandraServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraServiceApplication.class, args);
	}

}
