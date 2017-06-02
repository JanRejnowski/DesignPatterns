package com.janek.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class AudiCarFactory implements CarFactory{

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("a3")) {
            Engine audiEngine = new Engine(200,3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi(audiEngine,audiWheels,"a3");
        }
        if (model.equals("r8")) {
            Engine audiEngine = new Engine(600,5000, "gas");
            Wheels audiWheels = new Wheels(19, "summer");
            car = new Audi(audiEngine,audiWheels,"r8");
        }
        return null;
    }
}
