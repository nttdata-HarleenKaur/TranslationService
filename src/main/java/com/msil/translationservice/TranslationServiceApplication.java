package com.msil.translationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class TranslationServiceApplication {

	/*@Bean
    public AmazonDynamoDB amazonDynamoDB() {
		System.out.println("TESTTTTT");
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new EndpointConfiguration("http://localhost:8000", "localhost"))
                .build();
    }*/
	public static void main(String[] args) {
		SpringApplication.run(TranslationServiceApplication.class, args);
		/*TranslationServiceApplication app = new TranslationServiceApplication();
        AmazonDynamoDB dynamoDB = app.amazonDynamoDB();
        System.out.println("Tables: " + dynamoDB.listTables());
        AmazonDynamoDB dynamoDB = new DynamoDBConfig().amazonDynamoDB();
       System.out.println("Tables: " + dynamoDB.listTables());*/
	}

}