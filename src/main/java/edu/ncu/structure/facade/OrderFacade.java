package edu.ncu.structure.facade;

public class OrderFacade {

    private StockManager stockManager;
    private OrderManager orderManager;
    private PayManager payManager;

    public OrderFacade(StockManager stockManager, PayManager payManager, OrderManager orderManager) {
        this.stockManager = stockManager;
        this.payManager = payManager;
        this.orderManager = orderManager;
    }

    public void createOrder(String imei){
       String orderCode = orderManager.createOrder(imei);
       stockManager.preempt(imei);
       payManager.pay(orderCode);
       stockManager.outStock(imei);
       orderManager.finishOrder(imei);
    }
}
