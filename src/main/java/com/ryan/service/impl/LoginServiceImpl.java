package com.ryan.service.impl;

import com.ryan.dao.LoginDao;
import com.ryan.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    public boolean checkLogin(String email, String password) {
        return loginDao.checkLogin(email, password);
    }
}
