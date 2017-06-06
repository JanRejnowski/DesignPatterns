package com.janek.mvc;

import java.util.Scanner;

/**
 * Created by RENT on 2017-06-06.
 */
public class Application {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handle("home html");


    }
}
