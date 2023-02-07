package com.example.peliculasarqhexagonal.application.repository;

import com.example.peliculasarqhexagonal.domain.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {
}
