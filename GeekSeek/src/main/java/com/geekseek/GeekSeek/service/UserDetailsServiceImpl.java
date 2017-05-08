package com.geekseek.GeekSeek.service;

//import com.springproject.Spring4MVC.model.Role;
import com.geekseek.GeekSeek.model.User;
import com.geekseek.GeekSeek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

   // @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

       Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
       // for (Role role : user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(user.getUsername()));
       // } 

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}