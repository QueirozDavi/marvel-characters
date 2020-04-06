package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Stories;

import java.util.ArrayList;

public class StoriesBuilder {

    private Stories stories;

    public StoriesBuilder() {
        stories = new Stories();
    }

    public Stories build() {
        return stories;
    }

    public StoriesBuilder withReturned (int returned) {
        stories.setReturned(returned);
        return this;
    }

    public StoriesBuilder withAvailable (int available) {
        stories.setAvailable(available);
        return this;
    }

    public StoriesBuilder withItems () {
        stories.setItems(new ArrayList<>());
        stories.getItems().add(new ItemBuilder().withName("Item 1").withResourceUri("uri 1").build());
        stories.getItems().add(new ItemBuilder().withName("Item 2").withResourceUri("uri 2").build());
        stories.getItems().add(new ItemBuilder().withName("Item 3").withResourceUri("uri 3").build());
        stories.getItems().add(new ItemBuilder().withName("Item 4").withResourceUri("uri 4").build());
        stories.getItems().add(new ItemBuilder().withName("Item 5").withResourceUri("uri 5").build());
        stories.getItems().add(new ItemBuilder().withName("Item 6").withResourceUri("uri 6").build());
        stories.getItems().add(new ItemBuilder().withName("Item 7").withResourceUri("uri 7").build());
        stories.getItems().add(new ItemBuilder().withName("Item 8").withResourceUri("uri 8").build());

        return this;
    }
}
