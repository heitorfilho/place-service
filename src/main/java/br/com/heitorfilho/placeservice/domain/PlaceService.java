package br.com.heitorfilho.placeservice.domain;

import br.com.heitorfilho.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

// responsavel pela regra de negocios

public class PlaceService {

    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    // Por ser api reativa nao retornamos a entidade direta, retornamos o mono dela
    
    public Mono<Place> create(PlaceRequest placeRequest){

        var place = new Place(null, placeRequest.name(), placeRequest.slug(),
        placeRequest.state(), placeRequest.createdAt(), placeRequest.updateAt());
        return placeRepository.save(place);
    }
    
}
