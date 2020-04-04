package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Events;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsRepository extends MongoRepository<Events, String> {

    
}
