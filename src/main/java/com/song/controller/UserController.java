package com.song.controller;

import com.song.service.UserService;
import com.song.test.test.test.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}")
    public List<User> getUserByName(@PathVariable("name") String name){
        return userService.getUserByName(name);
    }

}
