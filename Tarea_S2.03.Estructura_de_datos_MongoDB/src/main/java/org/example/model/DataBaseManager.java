package org.example.model;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

public class DataBaseManager {

    private final MongoClient mongoClient;
    private com.mongodb.client.MongoDatabase database;

    public DataBaseManager() {

        mongoClient = MongoClients.create("mongodb://localhost:27017");

        database = mongoClient.getDatabase("optica");
    }

}
