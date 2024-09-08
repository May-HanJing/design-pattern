package edu.ncu.structure.adapter;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderApi orderApi;


    public void pushOrder(List<Order> orders) {
        System.out.println("service to order is push,start...");
        for (Order order : orders) {
            orderApi.pullOrder(orders);
        }
        System.out.println("service order is push.end...");
    }
}
