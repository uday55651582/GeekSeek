package com.geekseek.GeekSeek.service;

import com.geekseek.GeekSeek.model.User;

public interface UserService {
	
    void save(User user);

    User findByUsername(String username);
}
