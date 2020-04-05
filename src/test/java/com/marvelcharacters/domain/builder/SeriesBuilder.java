package com.marvelcharacters.domain.builder;


import com.marvelcharacters.domain.Series;

public class SeriesBuilder {

    private Series series;

    public SeriesBuilder() {
        series = new Series();
    }

    public Series build() {
        return series;
    }

    public SeriesBuilder withSeriesId(String eventsId){
        series.setId(eventsId);
        return this;
    }

    public SeriesBuilder withReturned (int returned) {
        series.setReturned(returned);
        return this;
    }

    public SeriesBuilder withAvailable (int available) {
        series.setAvailable(available);
        return this;
    }
}
