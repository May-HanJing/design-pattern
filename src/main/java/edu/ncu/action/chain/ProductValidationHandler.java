package edu.ncu.action.chain;


import cn.hutool.core.util.ObjectUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author HanJing
 */
public class ProductValidationHandler implements ValidationHandler{
    private ValidationHandler handler;

    @Override
    public void validation(BaseRequest baseRequest) {
        if(StringUtils.isBlank(baseRequest.getSkuCode())){
            throw  new BusinessException("skuCode is not exist");
        }
        System.out.println("ProductValidationHandler start...");

        if(ObjectUtil.isNotNull(handler)){
            handler.validation(baseRequest);
        }
        System.out.println("ProductValidationHandler end...");

    }

    @Override
    public ValidationHandler next(ValidationHandler handler) {
        this.handler = handler;
        return handler;
    }
}
