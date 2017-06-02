package com.janek.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car2 = abstractCarFactory.buildBMWCar("x5");
        Car car3 = abstractCarFactory.buildMercedesCar("s600");
//        AudiCarFactory audiCarFactory = new AudiCarFactory();
//        Car car = audiCarFactory.buildCar("a3");
//        Engine audiEngine = new Engine(200,3000,"diesel");
//        Wheels audiWheels = new Wheels(18,"summer");
//        Audi audi = new Audi(audiEngine,audiWheels,"a3");
//
//        audi.drive();
//
//        Engine mercedesEngine = new Engine(300,3000,"gas");
//        Wheels mercedesWheels = new Wheels(19,"winter");
//        Mercedes mercedes = new Mercedes(mercedesEngine,mercedesWheels,"s600");
//
//        mercedes.drive();
    }
}
