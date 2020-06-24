package com.playground.user.auth.service;

import com.playground.user.auth.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
   private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User loadUserByUsername(String name) throws UsernameNotFoundException {
        com.playground.user.auth.db.entity.User applicationUser = userRepository.findByName(name);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(name);
        }
        return new User(applicationUser.getName(), applicationUser.getPassword(), emptyList());
    }
}
