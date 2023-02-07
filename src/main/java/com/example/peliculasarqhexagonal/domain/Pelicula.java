package com.example.peliculasarqhexagonal.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pelicula {
    Integer id;
    String nombre;
    Integer anio;
    String director;
    Double ranking;
}
