package com.example.peliculasarqhexagonal.application.service;

import com.example.peliculasarqhexagonal.application.repository.PeliculaRepository;
import com.example.peliculasarqhexagonal.domain.Pelicula;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PeliculaServiceImpl implements PeliculaService {
    private final PeliculaRepository peliculaRepository;

    @Override
    public Iterable<Pelicula> buscarTodo() {
        return peliculaRepository.findAll();
    }

    @Override
    public void guardar(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula buscarId(Integer id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void editar(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void eliminar(Integer id) {
        peliculaRepository.deleteById(id);
    }
}
