package com.marvelcharacters.controller.v1;

import com.marvelcharacters.domain.Character;
import com.marvelcharacters.domain.dto.CharacterCollectionDTO;
import com.marvelcharacters.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/character")
@CrossOrigin(origins = "*")
public class CharacterController {

    private final CharacterService service;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.service = characterService;
    }

    @GetMapping
    public Page<Character> getCharacters(
            @RequestParam(value = "name", required = false, defaultValue = "") String name,
            @RequestParam(value = "comicsIds", required = false, defaultValue = "") List<String> comicsIds,
            @RequestParam(value = "seriesIds", required = false, defaultValue = "") List<String> seriesIds,
            @RequestParam(value = "eventsIds", required = false, defaultValue = "") List<String> eventsIds,
            @RequestParam(value = "storiesIds", required = false, defaultValue = "") List<String> storiesId,
            Pageable pageable) {

            return service.getCharacters(name, comicsIds, seriesIds, eventsIds, storiesId, pageable);
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable String id){
        return service.getCharacterById(id);
    }

    @GetMapping("/{id}/comics")
    public Page<CharacterCollectionDTO> getCharacterComics(@PathVariable String id, Pageable pageable){
        return service.getAllCharacterComics(id, pageable);
    }

    @GetMapping("/{id}/series")
    public Page<CharacterCollectionDTO> getCharacterSeries(@PathVariable String id, Pageable pageable){
        return service.getAllCharacterSeries(id, pageable);
    }

    @GetMapping("/{id}/stories")
    public Page<CharacterCollectionDTO> getCharacterStories(@PathVariable String id, Pageable pageable){
        return service.getAllCharacterStories(id, pageable);
    }

    @GetMapping("/{id}/events")
    public Page<CharacterCollectionDTO> getCharacterEvents(@PathVariable String id, Pageable pageable){
        return service.getAllCharacterEvents(id, pageable);
    }
}
