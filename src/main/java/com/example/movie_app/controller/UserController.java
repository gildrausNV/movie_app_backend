package com.example.movie_app.controller;

import com.example.movie_app.model.Movie;
import com.example.movie_app.model.User;
import com.example.movie_app.model.Watchlist;
import com.example.movie_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @GetMapping("/watchlist/{userId}")
    public Watchlist getWatchlistByUser(@PathVariable String userId){
        return userService.findWatchlistByUserId(userId);
    }

    @PostMapping("/watchlist/{userId}")
    public Watchlist addToWatchlist(@PathVariable String userId, @RequestBody Movie movie){
        return userService.addToWatchlist(movie, userId);
    }
}
