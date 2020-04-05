package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Item;

public class ItemBuilder {

    private Item item;

    public ItemBuilder() {
        item = new Item();
    }

    public Item build() {
        return item;
    }

    public ItemBuilder withResourceUri (String uri){
        item.setResourceURI(uri);
        return this;
    }

    public ItemBuilder withName (String name){
        item.setName(name);
        return this;
    }
}
