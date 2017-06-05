package com.janek.builder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by RENT on 2017-06-05.
 */
@Builder
@Data
public class User {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private int age;
}
