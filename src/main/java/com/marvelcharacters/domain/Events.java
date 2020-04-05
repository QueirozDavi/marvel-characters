package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marvelcharacters.domain.dto.ItemDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Data
@Document
public class Events {


    private Integer available;
    public String collectionURI;
    public List<Item> items = null;
    public Integer returned;
}


