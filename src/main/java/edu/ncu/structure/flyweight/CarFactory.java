package edu.ncu.structure.flyweight;

import java.util.Map;

public class CarFactory {

    public static Map<String, Car> carMap = new java.util.concurrent.ConcurrentHashMap<>();
    public static  Car getCar(String brand,String engine){
        Car car = carMap.get(engine);
        if (car == null) {
            if ("Benz".equals(brand)) {
                car = new BenzCar(engine);
            } else if ("Bmw".equals(brand)) {
                car = new BmwCar(engine);
            }
            carMap.put(engine, car);
        }
            return car;

    }
}
