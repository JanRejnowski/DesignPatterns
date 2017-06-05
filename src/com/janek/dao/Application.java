package com.janek.dao;

import com.janek.builder.User;

import java.io.File;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    private static final String PATH = "C:\\Users\\RENT\\IdeaProjects\\projekt\\Wzorce-projektowe\\users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));
        userDao.addUser(User.builder()
                        .firstName("Michal")
                        .lastName("Wisniewski")
                        .age(33)
                        .build());

        List<User> allUsers = userDao.getAllUser();
        allUsers.forEach(e -> System.out.println(e));
//      allUsers.forEach(System.out::println);
    }
}
