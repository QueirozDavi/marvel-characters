
package com.marvelcharacters.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class StoriesDTO {

    @JsonProperty("available")
    public Integer available;
    @JsonProperty("collectionURI")
    public String collectionURI;
    @JsonProperty("items")
    public List<ItemDTO> items = null;
    @JsonProperty("returned")
    public Integer returned;

}
