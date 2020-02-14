package com.example1.demo1.service.impl;

import com.example1.demo1.model.User;
import com.example1.demo1.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/13/2020, thur
 **/

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    UserRepository userRepository;
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User applicationUser = userRepository.findByUsername(userName);
        if(applicationUser == null) {
            throw new UsernameNotFoundException(userName);
        }
        return new org.springframework.security.core.userdetails.User(applicationUser.getUsername(),
                applicationUser.getPassword(), Collections.emptyList());
    }

}
