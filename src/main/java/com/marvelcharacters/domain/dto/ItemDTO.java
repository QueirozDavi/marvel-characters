
package com.marvelcharacters.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class ItemDTO {

    @JsonProperty("resourceURI")
    public String resourceURI;
    @JsonProperty("name")
    public String name;

}
