package com.solera.forumapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "account")
    private List<Post> posts;

}
