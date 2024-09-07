package edu.ncu.action.template;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanJing
 */
@Data
@Accessors(chain = true)
public class Store {

    private String storeCode;

    private String storeName;
}
