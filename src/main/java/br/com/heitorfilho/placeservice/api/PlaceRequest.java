package br.com.heitorfilho.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
    String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updateAt) {
    
}
