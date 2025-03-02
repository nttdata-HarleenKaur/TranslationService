package com.msil.translationservice.configuration;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
@Configuration

public class DynamoDBConfig {
	/*@Value("${amazon.dynamodb.endpoint}")
    private String amazonDynamoDBEndpoint;

    @Value("${amazon.aws.accesskey}")
    private String amazonAWSAccessKey;

    @Value("${amazon.aws.secretkey}")
    private String amazonAWSSecretKey;*/

   
	/*@Bean
    public AmazonDynamoDB amazonDynamoDB() {
       
    	
    	AmazonDynamoDB dynamoDB = AmazonDynamoDBClientBuilder.standard()

                .withEndpointConfiguration(new EndpointConfiguration("http://localhost:8000", "localhost"))

                .build();
    	return dynamoDB;
    }*/

  /* @Bean
   public AWSCredentials amazonAWSCredentials() {
    return new BasicAWSCredentials(amazonAWSAccessKey, amazonAWSSecretKey);
}*/
	
	@Bean
    public DynamoDbClient dynamoDbClient() {
       /* return DynamoDbClient.builder()
                .region(Region.US_EAST_1) // Specify your region
                .build();*/
        
        
        return DynamoDbClient.builder()
                
                .endpointOverride(URI.create("http://localhost:8000"))
                .build();
	}

}
