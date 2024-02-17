package com.example.movie_app.service;

import com.example.movie_app.model.Actor;
import com.example.movie_app.model.ActorRole;
import com.example.movie_app.model.Movie;
import com.example.movie_app.repository.ActorRepository;
import com.example.movie_app.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(String movieId) {
        return movieRepository.findById(movieId).orElseThrow(NoSuchElementException::new);
    }

    public List<Actor> getMovieActors(String movieId) {
        List<ActorRole> roles = getMovieById(movieId).getRoles();

        List<Actor> movieActors = new ArrayList<>();

        for(ActorRole ar: roles){
            movieActors.add(actorRepository.findById(ar.getActorId()).orElseThrow(NoSuchElementException::new));
        }

        return movieActors;
    }


    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
