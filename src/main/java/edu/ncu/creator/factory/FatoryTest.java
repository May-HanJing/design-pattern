package edu.ncu.creator.factory;

public class FatoryTest {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.getAnimal(1);
        System.out.println(animal.getName());
        animal.bark();

        animal = AnimalFactory.getAnimal(2);
        System.out.println(animal.getName());
        animal.bark();

        animal = AnimalFactory.getAnimal(3);
        System.out.println(animal.getName());
        animal.bark();
    }
}
