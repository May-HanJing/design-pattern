package edu.ncu.structure.adapter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeituanManagerService {



    public Boolean pullOrder(List<MeituanOrder> orders) {
        System.out.println("RPC meituan manager-service to pull order,start...");
        for (MeituanOrder meituanOrder : orders) {
            System.out.println(meituanOrder);
        }
        System.out.println("RPC meituan manager-service to pull order,end...");
        return true;
    }
}
