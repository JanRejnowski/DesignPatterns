package com.janek.factory;

import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 */
public class Audi implements Car {
    private Engine engine;

    private String model;

    private Wheels wheels;

    public Audi(Engine engine, Wheels wheels, String model) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with Audi");
        System.out.println("Engine: " + engine.toString());
        System.out.println("Wheels: " + wheels.toString());
    }
}
