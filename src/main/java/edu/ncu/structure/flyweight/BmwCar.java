package edu.ncu.structure.flyweight;

public class BmwCar extends Car {

    public BmwCar(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("Bmw car is run");
    }

    @Override
    public void stop() {
        System.out.println("Bmw car is stop");
    }
}
