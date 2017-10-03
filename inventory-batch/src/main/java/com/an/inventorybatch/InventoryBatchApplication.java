package com.an.inventorybatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.an.inventorybatch"})
@EnableMongoRepositories("com.an.inventorybatch.repository")
public class InventoryBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryBatchApplication.class, args);
	}
}
