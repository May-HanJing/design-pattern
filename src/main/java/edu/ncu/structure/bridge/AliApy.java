package edu.ncu.structure.bridge;

import java.math.BigDecimal;

public class AliApy extends Pay{
    public AliApy(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝中...");
        payMode.security(uId);
        return "1111";
    }
}
