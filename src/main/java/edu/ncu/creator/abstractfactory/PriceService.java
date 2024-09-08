package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public interface PriceService {

    BigDecimal getPrice(boolean newRetail);

    BigDecimal getRetailGuidePrice(String key);
}
