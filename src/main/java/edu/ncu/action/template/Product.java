package edu.ncu.action.template;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanJing
 */
@Data
@Accessors(chain = true)
public class Product {

    private String skuCode;

    private String skuName;
}
