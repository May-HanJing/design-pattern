package edu.ncu.structure.adapter;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeituanOrderService {

   void pushOrder(List<Order> orders) {
       System.out.println("JD order is push,start...");
       System.out.println(orders);
       System.out.println("JD order is push.end...");
   }
}
