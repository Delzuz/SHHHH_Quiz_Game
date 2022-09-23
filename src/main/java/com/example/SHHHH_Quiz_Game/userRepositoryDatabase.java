package com.example.SHHHH_Quiz_Game;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface userRepositoryDatabase extends CrudRepository<User, Long> {
    List<User> findByUsername(String username);
}
