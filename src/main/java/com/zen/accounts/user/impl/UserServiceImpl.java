package com.zen.accounts.user.impl;

import java.util.*;
import java.util.List;

//import com.zen.accounts.user.UserRepository;
import com.zen.accounts.user.UserService;
import com.zen.accounts.user.model.User;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
//    UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public List<User> getUsers() {
//        return userRepository.findAll();
        return new ArrayList<User>();
    }

    @Override
    public void saveUser(User user) {
//        userRepository.save(user);
    }

}