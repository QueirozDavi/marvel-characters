package com.marvelcharacters.domain.builder;

import com.marvelcharacters.domain.Events;

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
}
