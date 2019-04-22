package com.ryan.dao.impl;

import com.ryan.dao.LoginDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

    @Resource
    private SessionFactory sessionFactory;

    public boolean checkLogin(String email, String password) {
        Session session = sessionFactory.openSession();
        boolean userFound = false;

        String SQL_QUERY = "FROM User AS u WHERE u.email= :email and u.password= :password ";
        Query query  = session.createQuery(SQL_QUERY);
        query.setParameter("email", email);
        query.setParameter("password", password);
        List list = query.list();

        if((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        session.close();
        return userFound;
    }
}
