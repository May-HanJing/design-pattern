package edu.ncu.structure.adapter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JddjManagerService {


    public Boolean pullOrder(List<JddjOrder> orders) {
        System.out.println("RPC jddj manager-service to pull order,start...");
        for (JddjOrder jddjOrder : orders) {
            System.out.println(jddjOrder);
        }
        System.out.println("RPC jddj manager-service to pull order,end...");
        return true;
    }
}
