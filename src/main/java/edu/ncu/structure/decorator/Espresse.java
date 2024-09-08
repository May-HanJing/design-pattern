package edu.ncu.structure.decorator;

public class Espresse implements Coffee {
    @Override
    public String describe() {
        return "Espresse";
    }

    @Override
    public double cost() {
        return 10;
    }
}
