package edu.ncu.structure.adapter;

import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderApi {

    void pullOrder(List<Order> orders);
}
