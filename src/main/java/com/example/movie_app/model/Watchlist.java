package com.example.movie_app.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "watchlist")
public class Watchlist {
    @Id
    private String id;
    private User user;
    private List<Movie> movies;

    public Watchlist(User user, List<Movie> movies) {
        this.user = user;
        this.movies = movies;
    }
}
