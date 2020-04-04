
package com.marvelcharacters.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class CharacterDTO {

    @Id
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("thumbnail")
    public ThumbnailDTO thumbnail;
    @JsonProperty("resourceURI")
    public String resourceURI;
    @JsonProperty("comics")
    public ComicsDTO comics;
    @JsonProperty("series")
    public SeriesDTO series;
    @JsonProperty("stories")
    public StoriesDTO stories;
    @JsonProperty("events")
    public EventsDTO events;
    @JsonProperty("urls")
    public List<UrlDTO> urls = null;

}
