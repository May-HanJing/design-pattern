package edu.ncu.structure.decorator;

/**
 * @author HanJing
 */
public abstract class CondimentDecorator implements Coffee {

    protected  Coffee coffee;

   public CondimentDecorator(Coffee coffee) {
       this.coffee = coffee;
   }


}
