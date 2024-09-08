package edu.ncu.structure.bridge;

import java.math.BigDecimal;

public class BridgeTest {
    public static void main(String[] args) {

        IPayMode payMode = new PwdMode();
        AliApy pay = new AliApy(payMode);
        pay.transfer("1", "2", new BigDecimal(3));
    }
}
