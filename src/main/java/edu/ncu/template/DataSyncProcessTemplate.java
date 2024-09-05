package edu.ncu.template;

import java.util.List;

public abstract class DataSyncProcessTemplate {

    abstract Store pullStore(String storeCode);

    abstract List<Product> pullProduct(Store store);

    abstract void verifyStore(Store store);

    abstract void verifyProduct(List<Product> products);

    abstract List<Price> buildPrice(Store store, List<Product> products);

    abstract void pushPrice(List<Price> prices);

    public final void excute(String storeCode) {
        Store store = pullStore(storeCode);
        verifyStore(store);
        List<Product> products = pullProduct(store);
        verifyProduct(products);
        List<Price> prices = buildPrice(store,products);
        pushPrice(prices);
    }
}
