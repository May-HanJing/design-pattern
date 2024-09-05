package edu.ncu.chain;

/**
 * @author HanJing
 */
public interface ValidationHandler {


    void  validation(BaseRequest baseRequest);


    ValidationHandler next(ValidationHandler handler);

}
