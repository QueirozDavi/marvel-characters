package com.marvelcharacters.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
public class Comics {

    @Id
    private String id;
    public Integer available;
    public String collectionURI;
    public List<Item> items;
    public Integer returned;
}
