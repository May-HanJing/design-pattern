package edu.ncu.action.chain;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanJing
 */
@Data
@Accessors(chain = true)
public class BaseRequest {


    private String storeCode;

    private String skuCode;

    private String wareHouse;
}
