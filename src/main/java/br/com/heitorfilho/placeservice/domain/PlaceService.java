package br.com.heitorfilho.placeservice.domain;

import com.github.slugify.Slugify;

import br.com.heitorfilho.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

// responsavel pela regra de negocios

public class PlaceService {

    private PlaceRepository placeRepository;
    private Slugify slg;


    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    // Por ser api reativa nao retornamos a entidade direta, retornamos o mono dela
    
    public Mono<Place> create(PlaceRequest placeRequest){

        var place = new Place(null, placeRequest.name(), slg.slugify(placeRequest.name()),
        placeRequest.state(), null, null);
        return placeRepository.save(place);
    }
    
}
