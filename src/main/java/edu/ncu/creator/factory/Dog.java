package edu.ncu.creator.factory;

public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Woof");
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
