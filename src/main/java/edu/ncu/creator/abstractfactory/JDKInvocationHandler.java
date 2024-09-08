package edu.ncu.creator.abstractfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private PriceAdapter priceAdapter;

    public JDKInvocationHandler(PriceAdapter priceAdapter) {
        this.priceAdapter = priceAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return PriceAdapter.class.getMethod(method.getName(),ClassLoaderUtils.getClazzByArgs(args)).invoke(priceAdapter,args);
    }
}
