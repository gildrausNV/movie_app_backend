package com.example.movie_app.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Document(collection = "movie")
public class Movie {
    @Id
    private String id;
    private String name;
    private String releaseDate;
    private String description;
    private String image;
}
