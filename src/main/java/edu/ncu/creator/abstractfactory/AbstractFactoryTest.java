package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public class AbstractFactoryTest {
    public static void main(String[] args) throws Exception {
        PriceService priceService = JDKProxy.getProxy(PriceServiceImpl.class,new NewRetailPriceAdapter());
        BigDecimal newRetails =  priceService.getRetailGuidePrice("new");
        System.out.println(newRetails);

        PriceService priceService1 = JDKProxy.getProxy(PriceServiceImpl.class,new NormalPriceAdapter());
        BigDecimal newRetails1 =  priceService1.getRetailGuidePrice("normal");
        System.out.println(newRetails1);
    }
}