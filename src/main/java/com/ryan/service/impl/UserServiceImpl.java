package com.ryan.service.impl;

import com.ryan.dao.UserDao;
import com.ryan.entity.User;
import com.ryan.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public void addUser(final User user) {
        userDao.addUser(user);
    }

    public void deleteUser(final int userId) {
        userDao.deleteUser(userId);
    }

    public User getUserById(final int userId) {
        return userDao.getUserById(userId);
    }

    public User getUserByEmail(final String userEmail) {
        return userDao.getUserByEmail(userEmail);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
