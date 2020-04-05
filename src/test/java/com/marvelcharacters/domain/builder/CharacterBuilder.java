package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.*;
import com.marvelcharacters.domain.Character;

import java.time.LocalDateTime;

public class CharacterBuilder {

    private Character character;

    public CharacterBuilder() {
        character = new Character();
    }

    public Character build() {
        return character;
    }

    public CharacterBuilder withStoriesId (String characterId){
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

    public CharacterBuilder withModified (LocalDateTime modified) {
        character.setModified(modified);
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
                .withStoriesId("iuyuoweirytuiopewr")
                .withAvailable(available)
                .withReturned(returned)
                .build();
        character.setComics(comics);
        return this;
    }

    public CharacterBuilder withSeries(int available, int returned) {
        Series comics = new SeriesBuilder()
                .withStoriesId("ksahjfgfaksçdjhg")
                .withAvailable(available)
                .withReturned(returned)
                .build();
        character.setSeries(comics);
        return this;
    }

    public CharacterBuilder withEvents(int available, int returned) {
        Series comics = new SeriesBuilder()
                .withStoriesId("9786543289fgbjfdvb")
                .withAvailable(available)
                .withReturned(returned)
                .build();
        character.setSeries(comics);
        return this;
    }

    public CharacterBuilder withStories(int available, int returned) {
        Stories stories = new StoriesBuilder()
                .withStoriesId("jsfhg764367jsfbjfsbsjf")
                .withAvailable(available)
                .withReturned(returned)
                .build();
        character.setStories(stories);
        return this;
    }
}
