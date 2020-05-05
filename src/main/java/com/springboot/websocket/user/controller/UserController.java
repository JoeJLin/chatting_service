package com.springboot.websocket.user.controller;

import com.springboot.websocket.user.model.User;
import com.springboot.websocket.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.getUserById(Integer.valueOf(id));
    }

    @PostMapping(value = "/user/signup")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
