package edu.ncu.structure.facade;

public class OrderManager {

    public String createOrder(String imei){
        System.out.println("order manager is create order");
        return "ORDER000001";
    }

    public void finishOrder(String imei){
        System.out.println("order manager is finish order");
    }
}
