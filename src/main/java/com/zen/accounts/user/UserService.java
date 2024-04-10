package com.zen.accounts.user;

import com.zen.accounts.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void saveUser(User user);
}