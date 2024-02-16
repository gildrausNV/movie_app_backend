package com.example.movie_app.controller;

import com.example.movie_app.model.Actor;
import com.example.movie_app.model.Movie;
import com.example.movie_app.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAll();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable String movieId){
        return movieService.getMovieById(movieId);
    }

    @GetMapping("/actors/{movieId}")
    public List<Actor> getMovieActors(@PathVariable String movieId) {
        return movieService.getMovieActors(movieId);
    }

}
