package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@Document
public class Character {

    @Id
    public String id;
    public String name;
    public String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public LocalDateTime modified;
    public Thumbnail thumbnail;
    public String resourceURI;
    public Comics comics;
    public Series series;
    public Stories stories;
    public Events events;
    public List<Url> urls;
}



