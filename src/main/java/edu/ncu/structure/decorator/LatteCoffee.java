package edu.ncu.structure.decorator;

public class LatteCoffee extends CondimentDecorator {

    public LatteCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String describe() {
        return coffee.describe() + " + 拿铁咖啡";
    }

    @Override
    public double cost() {
        return coffee.cost() + 10;
    }
}
