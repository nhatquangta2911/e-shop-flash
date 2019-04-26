package com.ryan.dao;

import com.ryan.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(final User user);

    void deleteUser(final int userId);

    User getUserById(final int userId);

    User getUserByEmail(final String userEmail);

    List<User> getAllUsers();

}
