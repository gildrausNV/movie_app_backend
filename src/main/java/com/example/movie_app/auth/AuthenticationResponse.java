package com.example.movie_app.auth;

import com.example.movie_app.model.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AuthenticationResponse {
    private String token;
    private Role role;
    private String id;
}
