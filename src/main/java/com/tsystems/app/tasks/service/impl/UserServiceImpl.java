package com.tsystems.app.tasks.service.impl;

import com.tsystems.app.tasks.dao.UserDao;
import com.tsystems.app.tasks.entity.User;
import com.tsystems.app.tasks.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ksenia on 28.09.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}
