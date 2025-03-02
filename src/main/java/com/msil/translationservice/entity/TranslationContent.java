package com.msil.translationservice.entity;
import java.util.Map;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean

public class TranslationContent {
	


	public String getLocaleId() {
		return localeId;
	}


	public void setLocaleId(String localeId) {
		this.localeId = localeId;
	}


	@DynamoDbPartitionKey
	
   public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}

	
    public Map<String, String> getDoc() {
        return doc;
    }

    public void setDoc(Map<String, String> doc) {
        this.doc = doc;
    }

private int _id;
	
	
    private String localeId;
    private Map<String, String> doc;
	//@DynamoDBAttribute(attributeName = "translations")
	
	//private Map<String,String> translationData;
}
