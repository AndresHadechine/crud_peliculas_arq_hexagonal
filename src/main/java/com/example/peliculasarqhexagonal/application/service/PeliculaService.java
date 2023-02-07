package com.example.peliculasarqhexagonal.application.service;

import com.example.peliculasarqhexagonal.domain.Pelicula;
import org.springframework.stereotype.Service;

@Service
public interface PeliculaService {

    Iterable<Pelicula> buscarTodo();

    void guardar(Pelicula pelicula);

    Pelicula buscarId(Integer id);

    void editar(Pelicula pelicula);

    void eliminar(Integer id);
}
