package edu.ncu.structure.flyweight;

public abstract class Car {

   private String  color;

   protected final String  brand;

   private String engine;

   public abstract void run();

   public abstract void stop();

    public Car(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }




}
