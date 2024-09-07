package edu.ncu.action.template;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MeituanDataSyncService extends DataSyncProcessTemplate{
    @Override
    Store pullStore(String storeCode) {
       return new Store().setStoreCode("MT001").setStoreName("美团门店-01");
    }

    @Override
    List<Product> pullProduct(Store store) {
        Product product1 = new Product().setSkuCode("PMT001").setSkuName("IQOO 12");
        Product product2 = new Product().setSkuCode("PMT002").setSkuName("IQOO 11");
        return Lists.newArrayList(product1,product2);
    }

    @Override
    void verifyStore(Store store) {
        System.out.println("MT store is verify");
    }

    @Override
    void verifyProduct(List<Product> products) {
        System.out.println("MT product is verify");

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
        System.out.println("MT price is push,start...");
        System.out.println(prices);
        System.out.println("MT price is push.end...");

    }
}
