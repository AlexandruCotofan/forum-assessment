package com.solera.forumapp.configuration;

import com.solera.forumapp.models.Account;
import com.solera.forumapp.models.Post;
import com.solera.forumapp.services.AccountService;
import com.solera.forumapp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Component
public class AutoSeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.showAll();

        if (posts.size() == 0) {

            Account account1 = new Account();
            Account account2 = new Account();

            account1.setUsername("username1");
            account2.setUsername("username2");
            account1.setPassword("pass1");
            account2.setPassword("pass2");

            accountService.save(account1);
            accountService.save(account2);

            Post post1 = new Post();
            post1.setTitle("post 1 title");
            post1.setBody("body of post 1");
            post1.setAccount(account1);

            Post post2 = new Post();
            post2.setTitle("post 2 title");
            post2.setBody("body of post2");
            post2.setAccount(account2);

            postService.save(post1);
            postService.save(post2);


        }
    }

}
