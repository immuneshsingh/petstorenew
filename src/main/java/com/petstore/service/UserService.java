package com.petstore.service;

import com.petstore.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUser();
}
