package com.msil.translationservice.repository;

import org.springframework.stereotype.Repository;

import com.msil.translationservice.entity.TranslationContent;

import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
@Repository
public class TranslationRepository {
	private final DynamoDbTable<TranslationContent> table;

    public TranslationRepository(DynamoDbClient dynamoDbClient) {
        DynamoDbEnhancedClient enhancedClient = DynamoDbEnhancedClient.builder()
                .dynamoDbClient(dynamoDbClient)
                .build();
        table = enhancedClient.table("MASSDETAILS", TableSchema.fromBean(TranslationContent.class));
    }

    public void insertItem(TranslationContent item) {
        table.putItem(item);
    }
}
