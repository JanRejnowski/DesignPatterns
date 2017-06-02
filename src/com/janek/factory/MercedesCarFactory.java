package com.janek.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class MercedesCarFactory implements CarFactory{
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("s600")) {
            Engine mercedesEngine = new Engine(300,3000,"gas");
            Wheels mercedesWheels = new Wheels(19,"winter");
            Mercedes mercedes = new Mercedes(mercedesEngine,mercedesWheels,"s600");
        }
        if(model.equals("cla500")){
            Engine mercedesEngine = new Engine(200,2000,"diesel");
            Wheels mercedesWheels = new Wheels(19,"winter");
            Mercedes mercedes = new Mercedes(mercedesEngine,mercedesWheels,"cla500");
        }
        return null;
    }
}
