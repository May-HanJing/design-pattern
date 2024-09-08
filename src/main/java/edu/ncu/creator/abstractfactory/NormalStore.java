package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

public class NormalStore {

    public BigDecimal price(){
        return new BigDecimal(700);
    }

    public String name(){
        return "Normal Store";
    }

    public boolean isNewRetailStore(){
        return false;
    }
}
