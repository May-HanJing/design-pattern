package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public class NewRetailStore {

    public BigDecimal guidePrice(){
        return new BigDecimal(100);
    }

    public String name(){
        return "New Retail Store";
    }

    public boolean isNewRetailSign(){
        return true;
    }
}
