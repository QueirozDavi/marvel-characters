package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class Stories {

    @Id
    private String id;
    public int available;
    public String collectionURI;
    public List<Item> items;
    public int returned;

}
