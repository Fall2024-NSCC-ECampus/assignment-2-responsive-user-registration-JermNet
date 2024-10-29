package com.example.assignment3again.repository;

import com.example.assignment3again.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);

    User findByUserName(String userName);
}
