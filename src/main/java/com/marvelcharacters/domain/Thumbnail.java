package com.marvelcharacters.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Thumbnail {

    @JsonProperty("path")
    public String path;
    @JsonProperty("extension")
    public String extension;
}
