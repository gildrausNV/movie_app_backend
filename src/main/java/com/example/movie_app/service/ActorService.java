package com.example.movie_app.service;

import com.example.movie_app.model.Actor;
import com.example.movie_app.model.Movie;
import com.example.movie_app.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    public List<Actor> getAllActors(){
        return actorRepository.findAll();
    }

    public Actor getActorById(String actorId) {
        return actorRepository.findById(actorId).orElseThrow(NoSuchElementException::new);
    }

    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public List<Actor> saveActors(List<Actor> actors) {
        List<Actor> currentActors = actorRepository.findAll();
        for (Actor actor: actors){
            if(!currentActors.contains(actor)){
                actorRepository.save(actor);
            }
        }
        return actorRepository.findAll();
    }

    public List<Actor> searchActors(String firstName) {
        return actorRepository.findActorByFirstName(firstName);
    }
}
