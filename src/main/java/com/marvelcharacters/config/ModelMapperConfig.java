package com.marvelcharacters.config;

import com.marvelcharacters.domain.Item;
import com.marvelcharacters.domain.dto.CharacterCollectionDTO;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addConverter(getMaptoComicsDTOMapper(), Item.class, CharacterCollectionDTO.class);

        return modelMapper;
    }

    private Converter<Item, CharacterCollectionDTO> getMaptoComicsDTOMapper(){
        return context ->{
            Item source = context.getSource();
            CharacterCollectionDTO characterCollectionDTO = new CharacterCollectionDTO();
            characterCollectionDTO.setResourceURI(source.getResourceURI());
            characterCollectionDTO.setTitle(source.getName());

            return characterCollectionDTO;
        };
    }
}
