package edu.ncu.structure.decorator;

public class AmericanCoffee extends CondimentDecorator {

    public AmericanCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String describe() {
        return coffee.describe()+" + 美式咖啡";
    }

    @Override
    public double cost() {
        return 20+coffee.cost();
    }
}
