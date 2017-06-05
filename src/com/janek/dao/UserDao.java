package com.janek.dao;

import com.janek.builder.User;

import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public interface UserDao {
    public List<User> getAllUser();

    void addUser(User user);

}
