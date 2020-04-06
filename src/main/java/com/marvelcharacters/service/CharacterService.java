package com.marvelcharacters.service;

import com.google.common.base.Strings;
import com.marvelcharacters.domain.Character;
import com.marvelcharacters.domain.dto.CharacterCollectionDTO;
import com.marvelcharacters.exception.NotFoundException;
import com.marvelcharacters.repository.CharacterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final MongoTemplate mongoTemplate;
    private final ModelMapper modelMapper;

    @Autowired
    public CharacterService(CharacterRepository characterRepository, MongoTemplate mongoTemplate,
                            ModelMapper modelMapper) {
        this.characterRepository = characterRepository;
        this.mongoTemplate = mongoTemplate;
        this.modelMapper = modelMapper;
    }

    public Page<Character> getCharacters(String name, List<String> comicsIds, List<String> seriesIds,
                                         List<String> eventsIds, List<String> storiesIds, Pageable pageable) throws NotFoundException {

        Query query = new Query();

        createCharactersCriteria(name, seriesIds, eventsIds, storiesIds, comicsIds, query);

        long total = mongoTemplate.count(query, Character.class);
        query.with(pageable);
        List<Character> characters = mongoTemplate.find(query, Character.class);

        return new PageImpl<>(characters, pageable, total);
    }

    public Character getCharacterById(String id) {
        return characterRepository.findById(id).orElseThrow(() -> new NotFoundException("Character with id: " + id +
                " not found."));
    }

    private void createCharactersCriteria(String name, List<String> seriesIds, List<String> eventsIds,
                                          List<String> storiesIds, List<String> comicsIds, Query query) {
        if (!Strings.isNullOrEmpty(name)) {
            query.addCriteria(where("name").regex(name, "i"));
        }

        if (!CollectionUtils.isEmpty(seriesIds)) {
            query.addCriteria(where("series.id").in(seriesIds));
        }

        if (!CollectionUtils.isEmpty(eventsIds)) {
            query.addCriteria(where("events.id").in(eventsIds));
        }

        if (!CollectionUtils.isEmpty(storiesIds)) {
            query.addCriteria(where("stories.id").in(storiesIds));
        }

        if (!CollectionUtils.isEmpty(comicsIds)) {
            query.addCriteria(where("comics.id").in(comicsIds));
        }
    }

    public Page<CharacterCollectionDTO> getAllCharacterComics(String characterId, Pageable pageable) {
        Character character = characterRepository.findById(characterId).orElseThrow(() -> new
                NotFoundException("Character with id: " + characterId +  "not found."));

        List<CharacterCollectionDTO> characterCollectionDTOS = new ArrayList<>();

        character.getComics().getItems().forEach(i -> characterCollectionDTOS.add(modelMapper.map(i, CharacterCollectionDTO.class)));
        long total = characterCollectionDTOS.size();

        return new PageImpl<>(characterCollectionDTOS, pageable, total);
    }

    public Page<CharacterCollectionDTO> getAllCharacterSeries(String characterId, Pageable pageable) {
        Character character = characterRepository.findById(characterId).orElseThrow(() -> new
                NotFoundException("Character with id: " + characterId +  "not found."));

        List<CharacterCollectionDTO> characterCollectionDTOS = new ArrayList<>();

        character.getSeries().getItems().forEach(i -> characterCollectionDTOS.add(modelMapper.map(i, CharacterCollectionDTO.class)));
        long total = characterCollectionDTOS.size();

        return new PageImpl<>(characterCollectionDTOS, pageable, total);
    }
}
