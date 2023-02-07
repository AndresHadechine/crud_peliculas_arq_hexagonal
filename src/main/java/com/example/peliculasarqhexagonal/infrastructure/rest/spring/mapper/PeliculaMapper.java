package com.example.peliculasarqhexagonal.infrastructure.rest.spring.mapper;

import com.example.peliculasarqhexagonal.domain.Pelicula;
import com.example.peliculasarqhexagonal.infrastructure.rest.spring.dto.PeliculaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeliculaMapper {
    Pelicula toEntity (PeliculaDTO dto);
}
