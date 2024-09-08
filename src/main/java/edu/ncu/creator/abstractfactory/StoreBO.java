package edu.ncu.creator.abstractfactory;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StoreBO {

    private String name;

    private boolean isNewRetailStore;

    private BigDecimal price;

    private String storeCode;
}
