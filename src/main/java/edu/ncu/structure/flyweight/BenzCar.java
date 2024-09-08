package edu.ncu.structure.flyweight;

public class BenzCar extends Car {

    public BenzCar(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("benz car is run");
    }

    @Override
    public void stop() {
        System.out.println("benz car is stop");
    }
}
