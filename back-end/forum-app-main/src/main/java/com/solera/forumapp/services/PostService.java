package com.solera.forumapp.services;

import com.solera.forumapp.models.Post;
import com.solera.forumapp.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getById(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> showAll() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        if (post.getId() == null) {

            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }
}