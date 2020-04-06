package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Comics;

import java.util.ArrayList;

public class ComicsBuilder {

    private Comics comics;

    public ComicsBuilder() {
        comics = new Comics();
    }

    public Comics build() {
        return comics;
    }

    public ComicsBuilder withReturned(int returned) {
        comics.setReturned(returned);
        return this;
    }

    public ComicsBuilder withAvailable(int available) {
        comics.setAvailable(available);
        return this;
    }

    public ComicsBuilder withItems () {
        comics.setItems(new ArrayList<>());
        comics.getItems().add(new ItemBuilder().withName("Item 1").withResourceUri("uri 1").build());
        comics.getItems().add(new ItemBuilder().withName("Item 2").withResourceUri("uri 2").build());
        comics.getItems().add(new ItemBuilder().withName("Item 3").withResourceUri("uri 3").build());
        comics.getItems().add(new ItemBuilder().withName("Item 4").withResourceUri("uri 4").build());
        comics.getItems().add(new ItemBuilder().withName("Item 5").withResourceUri("uri 5").build());
        comics.getItems().add(new ItemBuilder().withName("Item 6").withResourceUri("uri 6").build());
        comics.getItems().add(new ItemBuilder().withName("Item 7").withResourceUri("uri 7").build());
        comics.getItems().add(new ItemBuilder().withName("Item 8").withResourceUri("uri 8").build());

        return this;
    }

}
