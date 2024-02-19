package com.example.movie_app.repository;

import com.example.movie_app.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findCommentsByMovie_Id(String movieId);

    List<Comment> findCommentsByUser_Id(String userId);
}
