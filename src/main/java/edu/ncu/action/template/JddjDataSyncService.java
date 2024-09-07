package edu.ncu.action.template;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JddjDataSyncService extends DataSyncProcessTemplate{
    @Override
    Store pullStore(String storeCode) {
        System.out.println("store is pull;");
      return   new Store().setStoreCode("JD001").setStoreName("京东门店-01");
    }

    @Override
    List<Product> pullProduct(Store store) {
        System.out.println("product is pull");
        Product product1 = new Product().setSkuCode("PJD001").setSkuName("vivo X100");
        Product product2 = new Product().setSkuCode("PJD002").setSkuName("vivo X200");
        return Lists.newArrayList(product1,product2);
    }

    @Override
    void verifyStore(Store store) {
        System.out.println("JD store is verify");
    }

    @Override
    void verifyProduct(List<Product> products) {
        System.out.println("JD product is verify");

    }

    @Override
    List<Price> buildPrice(Store store, List<Product> products) {
       List<Price> prices = new ArrayList<>();
        for (Product product : products) {
            Price price = new Price();
            price.setStoreCode(store.getStoreCode());
            price.setStoreName(store.getStoreName());
            price.setSkuCode(product.getSkuCode());
            price.setSkuName(price.getSkuName());
            price.setPrice((Math.random() * 100));
            prices.add(price);
        }
       return prices;
    }

    @Override
    void pushPrice(List<Price> prices) {
        System.out.println("JD price is push,start...");
        System.out.println(prices);
        System.out.println("JD price is push.end...");

    }
}
