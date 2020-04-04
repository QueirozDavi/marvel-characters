
package com.marvelcharacters.domain.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesDTO {

    @JsonProperty("available")
    public Integer available;
    @JsonProperty("collectionURI")
    public String collectionURI;
    @JsonProperty("items")
    public List<ItemDTO> items = null;
    @JsonProperty("returned")
    public Integer returned;

}
