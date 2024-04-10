package com.zen.accounts.user;

import com.zen.accounts.user.model.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> getAllUser() {
        return this.userService.getUsers();
    }

    @PostMapping("users")
    public void postMethodName(@RequestBody User user) {
        this.userService.saveUser(user);
    }
    
    
}
