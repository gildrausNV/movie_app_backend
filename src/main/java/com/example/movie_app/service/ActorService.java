package com.example.movie_app.service;

import com.example.movie_app.model.Actor;
import com.example.movie_app.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    public List<Actor> getAllActors(){
        return actorRepository.findAll();
    }
}
