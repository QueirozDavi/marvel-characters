package com.marvelcharacters.domain.builder;


import com.marvelcharacters.domain.Series;

import java.util.ArrayList;

public class SeriesBuilder {

    private Series series;

    public SeriesBuilder() {
        series = new Series();
    }

    public Series build() {
        return series;
    }

    public SeriesBuilder withReturned (int returned) {
        series.setReturned(returned);
        return this;
    }

    public SeriesBuilder withAvailable (int available) {
        series.setAvailable(available);
        return this;
    }

    public SeriesBuilder withItems () {
        series.setItems(new ArrayList<>());
        series.getItems().add(new ItemBuilder().withName("Item 1").withResourceUri("uri 1").build());
        series.getItems().add(new ItemBuilder().withName("Item 2").withResourceUri("uri 2").build());
        series.getItems().add(new ItemBuilder().withName("Item 3").withResourceUri("uri 3").build());
        series.getItems().add(new ItemBuilder().withName("Item 4").withResourceUri("uri 4").build());
        series.getItems().add(new ItemBuilder().withName("Item 5").withResourceUri("uri 5").build());
        series.getItems().add(new ItemBuilder().withName("Item 6").withResourceUri("uri 6").build());
        series.getItems().add(new ItemBuilder().withName("Item 7").withResourceUri("uri 7").build());
        series.getItems().add(new ItemBuilder().withName("Item 8").withResourceUri("uri 8").build());

        return this;
    }
}
