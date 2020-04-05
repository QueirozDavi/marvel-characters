package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Stories;

public class StoriesBuilder {

    private Stories stories;

    public StoriesBuilder() {
        stories = new Stories();
    }

    public Stories build() {
        return stories;
    }

    public StoriesBuilder withStoriesId (String storiesId){
        stories.setId(storiesId);
        return this;
    }

    public StoriesBuilder withReturned (int returned) {
        stories.setReturned(returned);
        return this;
    }

    public StoriesBuilder withAvailable (int available) {
        stories.setAvailable(available);
        return this;
    }
}
