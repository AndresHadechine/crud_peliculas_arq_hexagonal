package com.example.peliculasarqhexagonal.infrastructure.rest.spring.controller;

import com.example.peliculasarqhexagonal.application.service.PeliculaService;
import com.example.peliculasarqhexagonal.domain.Pelicula;
import com.example.peliculasarqhexagonal.infrastructure.helpers.Response;
import com.example.peliculasarqhexagonal.infrastructure.helpers.ResponseBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
@RequiredArgsConstructor
public class PeliculaController {

    private final PeliculaService peliculaService;
    private final ResponseBuilder builder;


    @GetMapping(value = "/buscartodo")
    public Response buscarTodo() {
        List<Pelicula> peliculas = (List<Pelicula>) peliculaService.buscarTodo();
        if (peliculas.isEmpty()) {
            return builder.failed("Peliculas se encuentra vacío");
        }
        return builder.success(peliculas);
    }

    @PostMapping(value = "/guardar")
    public Response guardar(@RequestBody Pelicula pelicula) {
        peliculaService.guardar(pelicula);
        return builder.success();
    }

    @GetMapping(value = "/buscarporid/{id}")
    public Response buscarPorId(@PathVariable("id") Integer id) {
        Pelicula pelicula = peliculaService.buscarId(id);
        if (pelicula == null) {
            return builder.failed("Error, la pelicula no se encuentra");
        }
        return builder.success(pelicula);
    }
    @PutMapping(value = "/actualizar/{persona}")
    public Response actualizar(@RequestBody Pelicula pelicula) {
        peliculaService.guardar(pelicula);
        return builder.success();
    }

    @DeleteMapping(value = "borrar/{id}")
    public Response eliminar(@PathVariable("id") Integer id) {
        Pelicula pelicula = peliculaService.buscarId(id);
        if (pelicula == null) {
            return builder.failed("Error, la pelicula no se encuentra");
        }
        peliculaService.eliminar(pelicula.getId());
        return builder.success(pelicula);
    }
}
