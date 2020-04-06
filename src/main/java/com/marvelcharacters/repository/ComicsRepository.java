package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Comics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComicsRepository extends MongoRepository<Comics, String> {

    
}
