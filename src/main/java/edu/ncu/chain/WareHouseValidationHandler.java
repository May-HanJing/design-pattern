package edu.ncu.chain;

import cn.hutool.core.util.ObjectUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @author HanJing
 */
public class WareHouseValidationHandler implements ValidationHandler{

    private ValidationHandler handler;

    @Override
    public void validation(BaseRequest baseRequest) {
        if(StringUtils.isBlank(baseRequest.getWareHouse())){
            throw new BusinessException("ware House is not exist");
        }
        System.out.println("WareHouseValidationHandler start...");
        if(ObjectUtil.isNotNull(handler)){
            handler.validation(baseRequest);
        }
        System.out.println("WareHouseValidationHandler end...");

    }

    @Override
    public ValidationHandler next(ValidationHandler handler) {
        this.handler = handler;
        return handler;
    }
}
