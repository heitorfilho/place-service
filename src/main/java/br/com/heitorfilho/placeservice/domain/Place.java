package br.com.heitorfilho.placeservice.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

// Criado como record

public record Place(
    Long id, String name, String slug, String state, 
    @CreatedDate LocalDateTime createdAt, @LastModifiedDate LocalDateTime updateAt) {
    
}
