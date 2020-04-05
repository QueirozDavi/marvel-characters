package com.marvelcharacters.config;


import com.marvelcharacters.domain.Comics;
import com.marvelcharacters.domain.Events;
import com.marvelcharacters.domain.Stories;
import com.marvelcharacters.domain.builder.ComicsBuilder;
import com.marvelcharacters.domain.builder.EventsBuilder;
import com.marvelcharacters.domain.builder.ItemBuilder;
import com.marvelcharacters.domain.builder.StoriesBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockFactory {

    public List<Stories> getStories() {

        Stories s1 = new StoriesBuilder()
                .withStoriesId("asdfghjkl23456f")
                .withAvailable(1478)
                .withReturned(20)
                .build();

        s1.setItems(new ArrayList<>());
        s1.getItems().add(new ItemBuilder().withName("item1").withResourceUri("https://item.com/item1").build());
        s1.getItems().add(new ItemBuilder().withName("item2").withResourceUri("https://item.com/item2").build());
        s1.getItems().add(new ItemBuilder().withName("item3").withResourceUri("https://item.com/item3").build());

        Stories s2 = new StoriesBuilder()
                .withStoriesId("nbguyasdkdvu")
                .withAvailable(1111)
                .withReturned(15)
                .build();

        s2.setItems(new ArrayList<>());
        s2.getItems().add(new ItemBuilder().withName("item4").withResourceUri("https://item.com/item4").build());
        s2.getItems().add(new ItemBuilder().withName("item5").withResourceUri("https://item.com/item5").build());
        s2.getItems().add(new ItemBuilder().withName("item6").withResourceUri("https://item.com/item6").build());

        Stories s3 = new StoriesBuilder()
                .withStoriesId("nbguyasdkdvu")
                .withAvailable(557)
                .withReturned(15)
                .build();

        s3.setItems(new ArrayList<>());
        s3.getItems().add(new ItemBuilder().withName("item7").withResourceUri("https://item.com/item7").build());
        s3.getItems().add(new ItemBuilder().withName("item8").withResourceUri("https://item.com/item8").build());
        s3.getItems().add(new ItemBuilder().withName("item9").withResourceUri("https://item.com/item9").build());


        return Arrays.asList(s1, s2, s3);
    }

    public List<Events> getEvents() {

        Events e1 = new EventsBuilder()
                .withStoriesId("oituoiruwepiuypwebvg")
                .withAvailable(2222)
                .withReturned(511)
                .build();

        e1.setItems(new ArrayList<>());
        e1.getItems().add(new ItemBuilder().withName("item1").withResourceUri("https://item.com/item1").build());
        e1.getItems().add(new ItemBuilder().withName("item2").withResourceUri("https://item.com/item2").build());
        e1.getItems().add(new ItemBuilder().withName("item3").withResourceUri("https://item.com/item3").build());

        Events e2 = new EventsBuilder()
                .withStoriesId("kjhasfdjkhfdsjks")
                .withAvailable(4325)
                .withReturned(11)
                .build();

        e2.setItems(new ArrayList<>());
        e2.getItems().add(new ItemBuilder().withName("item4").withResourceUri("https://item.com/item4").build());
        e2.getItems().add(new ItemBuilder().withName("item5").withResourceUri("https://item.com/item5").build());
        e2.getItems().add(new ItemBuilder().withName("item6").withResourceUri("https://item.com/item6").build());

        Events e3 = new EventsBuilder()
                .withStoriesId("itruyweriouyiuowyu")
                .withAvailable(5789)
                .withReturned(10)
                .build();

        e3.setItems(new ArrayList<>());
        e3.getItems().add(new ItemBuilder().withName("item4").withResourceUri("https://item.com/item4").build());
        e3.getItems().add(new ItemBuilder().withName("item5").withResourceUri("https://item.com/item5").build());
        e3.getItems().add(new ItemBuilder().withName("item6").withResourceUri("https://item.com/item6").build());

        return Arrays.asList(e1, e2, e3);
    }

    public List<Comics> getComics() {

        Comics c1 = new ComicsBuilder()
                .withStoriesId("iuyuoweirytuiopewr")
                .withAvailable(3333)
                .withReturned(511)
                .build();

        c1.setItems(new ArrayList<>());
        c1.getItems().add(new ItemBuilder().withName("item1").withResourceUri("https://item.com/item1").build());
        c1.getItems().add(new ItemBuilder().withName("item2").withResourceUri("https://item.com/item2").build());
        c1.getItems().add(new ItemBuilder().withName("item3").withResourceUri("https://item.com/item3").build());

        Comics c2 = new ComicsBuilder()
                .withStoriesId("cderfvbgtyhnmuuoik")
                .withAvailable(1740)
                .withReturned(14)
                .build();

        c2.setItems(new ArrayList<>());
        c2.getItems().add(new ItemBuilder().withName("item4").withResourceUri("https://item.com/item4").build());
        c2.getItems().add(new ItemBuilder().withName("item5").withResourceUri("https://item.com/item5").build());
        c2.getItems().add(new ItemBuilder().withName("item6").withResourceUri("https://item.com/item6").build());

        return Arrays.asList(c1, c2);

    }

}
