package com.example.movie_app.repository;

import com.example.movie_app.model.Watchlist;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WatchlistRepository extends MongoRepository<Watchlist, String> {
    Watchlist findWatchlistByUser_Id(String userId);
}
