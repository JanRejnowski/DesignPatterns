package com.janek.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("x5")){
            Engine bmwEngine = new Engine(150,2000,"diesel");
            Wheels bmwWheels = new Wheels(19,"winter");
            car = new BMW(bmwEngine,bmwWheels,"x5");
        } else if(model.equals("m3")) {
            Engine bwmEngine = new Engine(250,3000,"diesel");
            Wheels bwmWheels = new Wheels(19,"winter");
            car = new BMW(bwmEngine,bwmWheels,"m3");
        }
        return null;
    }
}
