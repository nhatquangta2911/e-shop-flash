package com.ryan.dao.impl;

import com.ryan.dao.UserDao;
import com.ryan.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    public void addUser(final User user) {
        final Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void deleteUser(final int userId) {
        final Session session = sessionFactory.getCurrentSession();
        final User user = session.get(User.class, userId);
        if(user == null) {
            return;
        }
        session.delete(user);
        session.flush();
    }

    public User getUserById(final int userId) {
        final Session session = sessionFactory.getCurrentSession();
        final User user = session.get(User.class, userId);
        return user;
    }

    public List<User> getAllUsers() {
        final Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", User.class).getResultList();
    }
}
