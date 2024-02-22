package com.example.movie_app.repository;

import com.example.movie_app.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends MongoRepository<Actor, String> {
    List<Actor> findActorByFirstName(String firstName);
}
