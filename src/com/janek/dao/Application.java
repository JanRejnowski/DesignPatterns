package com.janek.dao;

import com.janek.UserPredicateFactory;
import com.janek.builder.User;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    private static final String PATH = "C:\\Users\\RENT\\IdeaProjects\\projekt\\Wzorce-projektowe\\users";
    public static void main(String[] args) {
        List<List<String>> nameList = Arrays.asList(
                Arrays.asList("Szymon", "Wojciech", "Tomasz"),
                Arrays.asList("Anna", "Janina", "Malgorzata"));

        nameList.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.startsWith("A"))
                .forEach(e -> System.out.println(e));

        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
        map.put("woman", Arrays.asList("Anna", "Janina", "Malgorzata"));

        map.entrySet()
                .stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .forEach(e -> System.out.println(e));


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
