package com.project.liminality.services;

import org.springframework.stereotype.Service;

import com.project.liminality.model.User;
import com.project.liminality.repository.UserRepository;

@Service
public class UserService {
    public User createUser() {
        User profile = new User();
        /* set profile parameters */
        return UserRepository.save();
    }
}
