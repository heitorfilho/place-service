package br.com.heitorfilho.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.heitorfilho.placeservice.domain.PlaceRepository;
import br.com.heitorfilho.placeservice.domain.PlaceService;

@Configuration
public class PlaceConfig {

    // Tambem e necessario injetar o repository

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
    
}
