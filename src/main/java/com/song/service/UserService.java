package com.song.service;

import com.song.test.test.test.user.User;
import com.song.test.test.test.user.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserManager userManager;

    public List<User> getUserByName(String name){
        System.out.println(name);
        List<User> collect = userManager.stream()
                .filter(user -> user.getName().equals(name))
                .collect(Collectors.toList());
        System.out.println(collect);
        return collect;
    }

}
