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
@Document(collection = "actor")
public class Actor {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String image;

}
