package com.janek.builder;

import lombok.*;

/**
 * Created by RENT on 2017-06-05.
 */
@Builder
@Data
@AllArgsConstructor
public class User {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private int age;
}
