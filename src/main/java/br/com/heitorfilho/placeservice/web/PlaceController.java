package br.com.heitorfilho.placeservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heitorfilho.placeservice.api.PlaceRequest;
import br.com.heitorfilho.placeservice.api.PlaceResponse;
import br.com.heitorfilho.placeservice.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceService placeService;
    
    // placeService vai ser injetado pelo construtor

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    // Usando DTOS

    @PostMapping
    public ResponseEntity<Mono<PlaceResponse>> create(@RequestBody PlaceRequest request) {
        var placeResponse = placeService.create(request).map(PlaceMapper::fromPlaceToResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse); // 201 - recurso criado
    }
}
