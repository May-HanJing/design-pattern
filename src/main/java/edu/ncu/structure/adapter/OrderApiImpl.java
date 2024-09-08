package edu.ncu.structure.adapter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderApiImpl implements OrderApi {
    @Override
    public void pushOrder(List<Order> orders) {
        System.out.println("PRC to push order start...");
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println("PRC to push order end...");
    }
}
