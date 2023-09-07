package br.com.heitorfilho.placeservice.domain;

import java.time.LocalDateTime;

// Criado como record

public record Place(
    Long id, String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updateAt) {
    
}
