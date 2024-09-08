package edu.ncu.structure.bridge;

import java.math.BigDecimal;

public class WechatPay extends Pay {

    public WechatPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("微信支付中...");
        return "0000";
    }
}
