package edu.ncu.structure.facade;

public class FacadeTest {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new StockManager(), new PayManager(), new OrderManager());
        orderFacade.createOrder("123456");
    }
}
