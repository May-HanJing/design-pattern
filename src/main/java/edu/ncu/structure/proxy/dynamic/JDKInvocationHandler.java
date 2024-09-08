package edu.ncu.structure.proxy.dynamic;

import edu.ncu.structure.proxy.RealPlayerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private RealPlayerImpl realPlayerImpl;

    public JDKInvocationHandler(RealPlayerImpl realPlayerImpl) {
        this.realPlayerImpl = realPlayerImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置方法");
        Object result = method.invoke(realPlayerImpl, args);
        return result;
    }
}
