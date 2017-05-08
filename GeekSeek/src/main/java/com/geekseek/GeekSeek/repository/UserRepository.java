package com.geekseek.GeekSeek.repository;

import com.geekseek.GeekSeek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}