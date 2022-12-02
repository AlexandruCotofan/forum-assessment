package com.example.forumbackend.items;

public class Post {
    private String title;
    private String category;
    private String body;

    public Post() {}
    public Post(String title, String category, String body) {
        this.setTitle(title);
        this.setCategory(category);
        this.setBody(body);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
