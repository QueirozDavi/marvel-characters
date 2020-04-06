package com.marvelcharacters.config;


import com.github.fakemongo.Fongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class FakeMongo extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "mockDB";
    }

    @Bean
    @Override
    public MongoClient mongo() {
        Fongo fongo = new Fongo("mockDB");
        return fongo.getMongo();
    }
}
