package com.example.movie_app.service;

import com.example.movie_app.model.Comment;
import com.example.movie_app.model.Movie;
import com.example.movie_app.model.User;
import com.example.movie_app.repository.CommentRepository;
import com.example.movie_app.repository.MovieRepository;
import com.example.movie_app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final MovieRepository movieRepository;
    private final UserService userService;

    public List<Comment> getMovieComments(String movieId) {
        return commentRepository.findCommentsByMovie_Id(movieId);
    }

    public List<Comment> getUserComments(String userId) {
        return commentRepository.findCommentsByUser_Id(userId);
    }

    public Comment save(String movieId, String content) {
        User currentlyLoggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Movie movie = movieRepository.findById(movieId).orElseThrow(NoSuchElementException::new);
        Comment comment = new Comment(movie, currentlyLoggedInUser, content);
        return commentRepository.save(comment);
    }
}
