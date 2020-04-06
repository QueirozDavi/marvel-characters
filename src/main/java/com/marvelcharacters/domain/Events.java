package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Data
public class Events {

    private Integer available;
    private String collectionURI;
    private List<Item> items = null;
    private Integer returned;
}


