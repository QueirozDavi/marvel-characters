package com.marvelcharacters.service;

import com.marvelcharacters.MarvelChacatersApplication;
import com.marvelcharacters.config.FakeMongo;
import com.marvelcharacters.config.MockFactory;
import com.marvelcharacters.domain.Character;
import com.marvelcharacters.domain.builder.CharacterBuilder;
import com.marvelcharacters.exception.NotFoundException;
import com.marvelcharacters.repository.CharacterRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@Import(value = {FakeMongo.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {MarvelChacatersApplication.class})
public class CharacterServiceTest {

    @InjectMocks
    @Autowired
    private CharacterService service;
    @Autowired
    private CharacterRepository repository;
    @Mock
    @Autowired
    private MongoTemplate mongoTemplate;

    Pageable pageDefault = new PageRequest(0, 10);


    @Before
    public void setUp() {
        List<Character> characters = new MockFactory().getCharacters();
        repository.save(characters);
    }

    @After
    public void tearDown() {
        repository.deleteAll();
    }

    @Test
    public void shouldFindAllCharactersWhenHasNoParameter() {

        Page<Character> characters = service.getCharacters(null, null, null, null,
                null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(2, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(2, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldFindAllCharactersWhenHasNameParameter() {

        Page<Character> characters = service.getCharacters("Test 1", null, null, null,
                null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(1, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(1, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldNotFindAllCharactersWhenHasIncorrectNameParameter() {

        Page<Character> characters = service.getCharacters("XPTO", null, null, null,
                null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(0, contents.size());
        assertEquals(0, characters.getTotalPages());
        assertEquals(0, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldFindAllCharactersWhenHasComicsIdsParameter() {

        Page<Character> characters = service.getCharacters(null, Arrays.asList("iuyuoweirytuiopewr", "hgfhfhfhfhf"), null,
                null, null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(2, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(2, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldNotFindAllCharactersWhenHasIncorrectComicsIdsParameter() {

        Page<Character> characters = service.getCharacters(null, Arrays.asList("xptohsyfdb", "hgfhfhfhfhf"), null,
                null, null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(0, contents.size());
        assertEquals(0, characters.getTotalPages());
        assertEquals(0, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldFindAllCharactersWhenHasSeriesIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, Arrays.asList("ksahjfgfaksçdjhg", "hjgdjdgh"),
                null, null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(2, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(2, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldNotFindAllCharactersWhenHasIncorrectSeriesIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, Arrays.asList("1g2h3j34kj54kl56", "hjgdjdgh"),
                null, null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(0, contents.size());
        assertEquals(0, characters.getTotalPages());
        assertEquals(0, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }


    @Test
    public void shouldFindAllCharactersWhenHasEventsIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, null,
                Arrays.asList("9786543289fgbjfdvb", "hjgdjdgh"), null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(2, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(2, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldNotFindAllCharactersWhenHasIncorrectEventsIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, null,
                Arrays.asList("1g2h3j34kj54kl56", "hjgdjdgh"), null, pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(0, contents.size());
        assertEquals(0, characters.getTotalPages());
        assertEquals(0, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldFindAllCharactersWhenHasStoriesIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, null,
               null,  Arrays.asList("jsfhg764367jsfbjfsbsjf", "hjgdjdgh"), pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(2, contents.size());
        assertEquals(1, characters.getTotalPages());
        assertEquals(2, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldNotFindAllCharactersWhenHasIncorrectStoriesIdsParameter() {

        Page<Character> characters = service.getCharacters(null, null, null,
                null,  Arrays.asList("kjwhjklw54967645fhb", "hjgdjdgh"), pageDefault);
        List<Character> contents = characters.getContent();

        assertNotNull(contents);
        assertEquals(0, contents.size());
        assertEquals(0, characters.getTotalPages());
        assertEquals(0, characters.getTotalElements());
        assertEquals(10, characters.getSize());
    }

    @Test
    public void shouldGetCharacterByIdWhenPassCorrectId() {

        Character expectedCharacter = new MockFactory().getCharacters().get(0);
        Character returnedCharacter = service.getCharacterById("hfdsgvfdfduiosdkj");

        assertEquals(expectedCharacter.getName(), returnedCharacter.getName());
        assertEquals(expectedCharacter.getResourceURI(), returnedCharacter.getResourceURI());
        assertEquals(expectedCharacter.getDescription(), returnedCharacter.getDescription());
        assertEquals(expectedCharacter.getId(), returnedCharacter.getId());
        assertEquals(expectedCharacter.getThumbnail(), returnedCharacter.getThumbnail());
    }

    @Test(expected = NotFoundException.class)
    public void shouldNotGetCharacterByIdWhenPassIncorrectId() {

        Character expectedCharacter = new MockFactory().getCharacters().get(0);
        Character returnedCharacter = service.getCharacterById("gthyukilop8ij75ftg");
    }
}