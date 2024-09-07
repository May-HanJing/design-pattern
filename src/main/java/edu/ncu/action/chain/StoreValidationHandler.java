package edu.ncu.action.chain;

import cn.hutool.core.util.ObjectUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author HanJing
 */
public class StoreValidationHandler implements ValidationHandler{

    private ValidationHandler validationHandler;

    @Override
    public void validation(BaseRequest baseRequest) {
        if(StringUtils.isBlank(baseRequest.getStoreCode())){
           throw  new BusinessException("store is not exist");
        }
        System.out.println("StoreValidationHandler start...");
        if(ObjectUtil.isNotNull(validationHandler)){
            validationHandler.validation(baseRequest);
        }
        System.out.println("StoreValidationHandler end...");

    }

    @Override
    public ValidationHandler next(ValidationHandler handler) {
        this.validationHandler = handler;
        return validationHandler;
    }
}
