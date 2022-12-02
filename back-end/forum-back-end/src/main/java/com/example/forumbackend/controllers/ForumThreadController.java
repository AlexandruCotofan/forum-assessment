package com.example.forumbackend.controllers;

import com.example.forumbackend.items.ForumThread;
import com.example.forumbackend.items.Post;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ForumThreadController {
    private List<ForumThread> forumThreadList = new ArrayList<>();

    public ForumThreadController() {
        ForumThread thread1 = new ForumThread("thread1");
        thread1.addPost(new Post("Post1", "question", "Post1Body"));
        thread1.addPost(new Post("Post2", "question", "Post2Body"));
        thread1.addPost(new Post("Post3", "suggestion", "Post3Body"));
        thread1.addPost(new Post("Post4", "clarification", "Post4Body"));
        forumThreadList.add(thread1);

        ForumThread thread2 = new ForumThread("thread2");
        thread2.addPost(new Post("Post1", "question", "Post1Body"));
        thread2.addPost(new Post("Post2", "question", "Post2Body"));
        thread2.addPost(new Post("Post3", "suggestion", "Post3Body"));
        thread2.addPost(new Post("Post4", "clarification", "Post4Body"));
        forumThreadList.add(thread2);

        ForumThread thread3 = new ForumThread("thread3");
        thread3.addPost(new Post("Post1", "question", "Post1Body"));
        thread3.addPost(new Post("Post2", "question", "Post2Body"));
        thread3.addPost(new Post("Post3", "suggestion", "Post3Body"));
        thread3.addPost(new Post("Post4", "clarification", "Post4Body"));
        forumThreadList.add(thread3);
    }

    @GetMapping("/")
    public List<ForumThread> getForumThreads() {
        return forumThreadList;
    }

    @GetMapping("/threads")
    public List<Post> getPostsFromThread(@RequestParam(name = "title") String threadTitle) {
        return forumThreadList.stream().filter(thread -> thread.getTitle().equals(threadTitle)).findFirst().get().getPosts();
    }

    @RequestMapping("/create")
    public void addPostToThread(@RequestBody String response, HttpServletResponse redirect) {
        System.out.println(response);
        /**
         * responseList[1] = thread title, responseList[3] = post category, responseList[5] = post title
         * responseList[7] = post body
         */
        try {
            List<String> responseList = Arrays.stream(response.split("[=&]")).toList();
            Post post = new Post(responseList.get(5), responseList.get(3), responseList.get(7));
            forumThreadList.stream().filter(thread -> thread.getTitle().equals(responseList.get(1))).findFirst().get().addPost(post);
            redirect.sendRedirect("http://localhost:3000");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
