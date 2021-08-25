package com.chenkh.user.service;

import com.chenkh.user.entity.User;
import com.chenkh.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id){
        return userRepository.findById(id) ;
    }

}
