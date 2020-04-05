package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character, String> {


}
