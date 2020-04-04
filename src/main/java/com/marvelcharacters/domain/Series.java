package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@Document
public class Series {

    @Id
    private String id;
    public Integer available;
    public String collectionURI;
    public List<Item> items;
    public Integer returned;
}
