package edu.ncu.creator.factory;

public class Cow implements Animal {
    @Override
    public void bark() {
        System.out.println("Moo");
    }

    @Override
    public String getName() {
        return "Cow";
    }
}
