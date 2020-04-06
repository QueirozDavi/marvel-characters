package com.marvelcharacters.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Comics {

    public Integer available;
    public String collectionURI;
    public List<Item> items;
    public Integer returned;
}
