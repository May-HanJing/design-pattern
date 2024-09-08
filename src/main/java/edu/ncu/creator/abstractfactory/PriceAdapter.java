package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public interface PriceAdapter {

    BigDecimal getRetailGuidePrice(String key);
}
