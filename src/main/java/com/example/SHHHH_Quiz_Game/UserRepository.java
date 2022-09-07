package com.example.SHHHH_Quiz_Game;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public List<User> printList () {
        return users;
    }


    public void addUser (User user) {
        users.add(user);

    }

}
