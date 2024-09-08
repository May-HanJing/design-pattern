package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public class NormalPriceAdapter implements PriceAdapter {




    @Override
    public BigDecimal getRetailGuidePrice(String key) {
        System.out.println("NormalPriceAdapter key:"+key);
        return new NormalStore().price();
    }
}
