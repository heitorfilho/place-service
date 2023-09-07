package br.com.heitorfilho.placeservice.web;

import br.com.heitorfilho.placeservice.api.PlaceResponse;
import br.com.heitorfilho.placeservice.domain.Place;

public class PlaceMapper {
    
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updateAt());
    }
}
