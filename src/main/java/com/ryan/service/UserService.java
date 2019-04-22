package com.ryan.service;

import com.ryan.entity.User;

import java.util.List;

public interface UserService {

    void addUser(final User user);

    void deleteUser(int userId);

    User getUserById(final int userId);

    List<User> getAllUsers();

}
