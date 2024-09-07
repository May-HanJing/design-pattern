package edu.ncu.creator.factory;

public class Cat implements Animal {
    @Override
    public void bark() {
        System.out.println("Meow");
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
