package com.example.webapplicationprogrammingassignment4.repository;

import com.example.webapplicationprogrammingassignment4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);

    User findByUserName(String userName);
    User findByEmail(String email);
}
