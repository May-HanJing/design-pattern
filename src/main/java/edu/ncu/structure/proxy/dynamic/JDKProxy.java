package edu.ncu.structure.proxy.dynamic;

import edu.ncu.structure.proxy.RealPlayerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxy {


    public static <T> T getProxy(Class<T> interfaceClass, RealPlayerImpl player) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(player);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
