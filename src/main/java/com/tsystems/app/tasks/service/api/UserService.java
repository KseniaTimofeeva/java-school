package com.tsystems.app.tasks.service.api;

import com.tsystems.app.tasks.entity.User;

import java.util.List;

/**
 * Created by ksenia on 28.09.2017.
 */
public interface UserService {

    List<User> findUsers(String searchedParam);
}
