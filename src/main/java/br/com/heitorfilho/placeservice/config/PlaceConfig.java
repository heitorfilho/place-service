package br.com.heitorfilho.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.heitorfilho.placeservice.domain.PlaceRepository;
import br.com.heitorfilho.placeservice.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {

    // Tambem e necessario injetar o repository

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
    
}
