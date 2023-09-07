package br.com.heitorfilho.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

// Repository como interface

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long>{
    
}
