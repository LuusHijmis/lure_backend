package com.example.lure.database;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name="users")
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String emailadres;
    private String password;

    public User(String email, String password) {
        this.emailadres = email;
        this.password = password;
    }

    // getters and set
}
