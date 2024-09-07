package edu.ncu.action.chain;

/**
 * @author HanJing
 */
public class ChainTest {
    public static void main(String[] args) {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setStoreCode("HJ001").setSkuCode("11190812");
        StoreValidationHandler handler = new StoreValidationHandler();
        handler.next(new ProductValidationHandler())
                .next(new WareHouseValidationHandler());
        handler.validation(baseRequest);
    }
}
