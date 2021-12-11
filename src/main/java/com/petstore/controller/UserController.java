package com.petstore.controller;


import com.petstore.model.User;
import com.petstore.repository.UserRepository;
import com.petstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/petstore")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/user")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

}
