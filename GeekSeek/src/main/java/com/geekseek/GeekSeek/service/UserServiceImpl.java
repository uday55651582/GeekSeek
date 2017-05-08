package com.geekseek.GeekSeek.service;

//import com.springproject.Spring4MVC.model.Role;
import com.geekseek.GeekSeek.model.User;
import com.geekseek.GeekSeek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired 
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   //@Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       // user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);   
      
    }

   // @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}