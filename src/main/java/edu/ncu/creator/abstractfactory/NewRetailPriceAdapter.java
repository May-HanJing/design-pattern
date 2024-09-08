package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public class NewRetailPriceAdapter implements PriceAdapter {




    @Override
    public BigDecimal getRetailGuidePrice(String key) {
        System.out.println("NewRetailPriceAdapter key:"+key);
        return new NewRetailStore().guidePrice();
    }
}
