package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class Stories {

    public int available;
    public String collectionURI;
    public List<Item> items;
    public int returned;

}
