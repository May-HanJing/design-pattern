package edu.ncu.structure.adapter;

import cn.hutool.core.bean.BeanUtil;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HanJing
 */
@Service
public class JddjOrderAdapter implements OrderAdapter {

    @Autowired
    private JddjManagerService jddjManagerService;

    @Override
    public void pullOrder(List<Order> orders) {
        System.out.println("jddj adapter to pull order...");
       List<JddjOrder> orderList =  BeanUtil.copyToList(orders, JddjOrder.class);
        jddjManagerService.pullOrder(orderList);
        System.out.println("jddj adapter pull order end...");
    }
}
