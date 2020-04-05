package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Comics;

public class ComicsBuilder {

    private Comics comics;

    public ComicsBuilder() {
        comics = new Comics();
    }

    public Comics build() {
        return comics;
    }

    public ComicsBuilder withComicsId(String storiesId) {
        comics.setId(storiesId);
        return this;
    }

    public ComicsBuilder withReturned(int returned) {
        comics.setReturned(returned);
        return this;
    }

    public ComicsBuilder withAvailable(int available) {
        comics.setAvailable(available);
        return this;
    }

}
