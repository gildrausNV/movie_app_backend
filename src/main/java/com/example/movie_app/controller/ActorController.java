package com.example.movie_app.controller;

import com.example.movie_app.model.Actor;
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
}
