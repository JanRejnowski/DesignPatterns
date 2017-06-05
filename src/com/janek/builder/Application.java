package com.janek.builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Janek")
                .lastName("Rejnowski")
                .age(23)
                .phoneNumber("123456789")
                .build();
        System.out.println(user);
    }
}
