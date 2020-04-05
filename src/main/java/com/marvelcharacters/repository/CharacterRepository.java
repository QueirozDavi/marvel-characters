package com.marvelcharacters.repository;

import com.marvelcharacters.domain.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CharacterRepository extends MongoRepository<Character, String> {

    Optional<Character> findById(String id);
}
