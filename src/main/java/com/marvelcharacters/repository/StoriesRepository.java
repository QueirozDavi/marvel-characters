package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Stories;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoriesRepository extends MongoRepository<Stories, String> {

    
}
