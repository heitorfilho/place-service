package br.com.heitorfilho.placeservice.domain;

import reactor.core.publisher.Mono;

// responsavel pela regra de negocios

public class PlaceService {

    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    // Por ser api reativa nao retornamos a entidade direta, retornamos o mono dela
    
    public Mono<Place> create(Place place){
        return placeRepository.save(place);
    }
    
}
