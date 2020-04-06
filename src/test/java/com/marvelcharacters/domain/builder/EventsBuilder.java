package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Events;

import java.util.ArrayList;

public class EventsBuilder {

    private Events events;

    public EventsBuilder() {
        events = new Events();
    }

    public Events build() {
        return events;
    }

    public EventsBuilder withEventsId(String eventsId){
        events.setId(eventsId);
        return this;
    }

    public EventsBuilder withReturned (int returned) {
        events.setReturned(returned);
        return this;
    }

    public EventsBuilder withAvailable (int available) {
        events.setAvailable(available);
        return this;
    }

    public EventsBuilder withItems () {
        events.setItems(new ArrayList<>());
        events.getItems().add(new ItemBuilder().withName("Item 1").withResourceUri("uri 1").build());
        events.getItems().add(new ItemBuilder().withName("Item 2").withResourceUri("uri 2").build());
        events.getItems().add(new ItemBuilder().withName("Item 3").withResourceUri("uri 3").build());
        events.getItems().add(new ItemBuilder().withName("Item 4").withResourceUri("uri 4").build());
        events.getItems().add(new ItemBuilder().withName("Item 5").withResourceUri("uri 5").build());
        events.getItems().add(new ItemBuilder().withName("Item 6").withResourceUri("uri 6").build());
        events.getItems().add(new ItemBuilder().withName("Item 7").withResourceUri("uri 7").build());
        events.getItems().add(new ItemBuilder().withName("Item 8").withResourceUri("uri 8").build());

        return this;
    }
}
