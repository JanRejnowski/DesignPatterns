package com.janek.dao;

import com.janek.builder.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class UserDaoInMemory implements UserDao{

    private List<User> users;

    public  UserDaoInMemory() {
        users = new ArrayList<>();
        users.add(User.builder()
                .firstName("Szymon")
                .lastName("Nowak")
                .age(23)
                .phoneNumber("1234567")
                .build() );
        users.add(User.builder()
                .firstName("Anna")
                .lastName("Kowalska")
                .age(40)
                .phoneNumber("09876543")
                .build());
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
