package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Series;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeriesRepository extends MongoRepository<Series, String> {

    
}
