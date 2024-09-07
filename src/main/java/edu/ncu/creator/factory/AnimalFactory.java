package edu.ncu.creator.factory;

public class AnimalFactory {

   public static Animal getAnimal(Integer type) {
       if (type == 1) {
           return new Dog();
       } else if (type == 2) {
           return new Cat();
       } else if (type == 3) {
           return new Cow();
       }
       return null;
   }
}
