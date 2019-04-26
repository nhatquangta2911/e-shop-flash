package com.ryan.service;

import com.ryan.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void addUser(final User user);

    void deleteUser(int userId);

    User getUserById(final int userId);

    User getUserByEmail(final String userEmail);

    List<User> getAllUsers();

}
