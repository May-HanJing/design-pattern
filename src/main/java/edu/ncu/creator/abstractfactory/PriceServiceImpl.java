package edu.ncu.creator.abstractfactory;

import java.math.BigDecimal;

/**
 * @author HanJing
 */
public class PriceServiceImpl implements PriceService{

    NewRetailStore newRetailStore = new NewRetailStore();
    NormalStore normalStore  = new NormalStore();

    public BigDecimal getGuidePrice(boolean sign, StoreBO storeBO){
        if(storeBO.isNewRetailStore()){
            return newRetailStore.guidePrice();
        }else{
            return normalStore.price();
        }
    }

    @Override
    public BigDecimal getPrice(boolean newRetail) {
      if(newRetail){
          return newRetailStore.guidePrice();
      }else{
          return normalStore.price();
      }

    }

    @Override
    public BigDecimal getRetailGuidePrice(String key) {
        return null;
    }
}
