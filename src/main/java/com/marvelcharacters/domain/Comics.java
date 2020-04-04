package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Document
public class Comics {

    @Id
    private String id;
    public Integer available;
    public String collectionURI;
    public List<Item> items = null;
    public Integer returned;
}
