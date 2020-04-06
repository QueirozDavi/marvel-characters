package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Character;
import com.marvelcharacters.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CharacterBuilder {

    private Character character;

    public CharacterBuilder() {
        character = new Character();
    }

    public Character build() {
        return character;
    }

    public CharacterBuilder withId (String characterId){
        character.setId(characterId);
        return this;
    }

    public CharacterBuilder withName (String name) {
        character.setName(name);
        return this;
    }

    public CharacterBuilder withDescription (String description) {
        character.setDescription(description);
        return this;
    }

    public CharacterBuilder withModified () {
        character.setModified(LocalDateTime.now());
        return this;
    }

    public CharacterBuilder withThumbnail (String path, String extension) {
        Thumbnail thumbnail = new Thumbnail();
        thumbnail.setPath(path);
        thumbnail.setExtension(extension);
        character.setThumbnail(thumbnail);
        return this;
    }

    public CharacterBuilder withResourceURI (String resourceUri) {
        character.setResourceURI(resourceUri);
        return this;
    }

    public CharacterBuilder withComics(int available, int returned) {
        Comics comics = new ComicsBuilder()
                .withAvailable(available)
                .withReturned(returned)
                .withItems()
                .build();
        character.setComics(comics);
        return this;
    }

    public CharacterBuilder withSeries(int available, int returned) {
        Series series = new SeriesBuilder()
                .withAvailable(available)
                .withReturned(returned)
                .withItems()
                .build();
        character.setSeries(series);
        return this;
    }

    public CharacterBuilder withEvents(int available, int returned) {
        Events events = new EventsBuilder()
                .withAvailable(available)
                .withReturned(returned)
                .withItems()
                .build();
        character.setEvents(events);
        return this;
    }

    public CharacterBuilder withStories(int available, int returned) {
        Stories stories = new StoriesBuilder()
                .withAvailable(available)
                .withReturned(returned)
                .withItems()
                .build();
        character.setStories(stories);
        return this;
    }

    public CharacterBuilder withUrls() {
        Url url = new Url();
        url.setType("type test");
        url.setUrl("https://www.test.com");

        character.setUrls(new ArrayList<>());
        character.getUrls().add(url);

        return this;
    }
}
