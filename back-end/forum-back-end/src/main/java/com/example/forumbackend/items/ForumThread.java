package com.example.forumbackend.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ForumThread {
    private String title;
    private List<Post> posts = new ArrayList<>();

    public ForumThread() {}
    public ForumThread(String title) {
        this.setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(Post post) {
        for (Post listPost:
             posts) {
            if (post.getTitle().equals(listPost.getTitle())) {
                return;
            }
        }
        this.posts.add(post);
    }
}
