package edu.ncu.structure.adapter;

import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeituanOrderAdapter implements OrderAdapter {

    @Autowired
    private MeituanManagerService meituanManagerService;

    @Override
    public void pullOrder(List<Order> orders) {
        System.out.println("meituan adapter to pull order...");
        List<MeituanOrder> ordersList = BeanUtil.copyToList(orders, MeituanOrder.class);
        meituanManagerService.pullOrder(ordersList);
        System.out.println("meituan adapter pull order end...");
    }
}
