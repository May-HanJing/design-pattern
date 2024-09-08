package edu.ncu.structure.adapter;

import lombok.Data;

@Data
public class Order {

    private String orderCode;

    private String storeCode;

    private String skuCode;

    private String skuName;

    private String price;

    private String createTime;

}
