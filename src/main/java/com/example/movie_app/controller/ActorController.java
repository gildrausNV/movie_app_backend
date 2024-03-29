package com.example.movie_app.controller;

import com.example.movie_app.model.Actor;
import com.example.movie_app.model.Movie;
import com.example.movie_app.repository.ActorRepository;
import com.example.movie_app.service.ActorService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @GetMapping
    public List<Actor> getAllActors(){
        return actorService.getAllActors();
    }

    @GetMapping("/{actorId}")
    public Actor getActorById(@PathVariable String actorId){
        return actorService.getActorById(actorId);
    }

    @PostMapping
    public Actor saveActor(@RequestBody Actor actor){
        return actorService.saveActor(actor);
    }
    @GetMapping("/search/{firstName}")
    public List<Actor> searchActors(@PathVariable String firstName){
        return actorService.searchActors(firstName);
    }
}
