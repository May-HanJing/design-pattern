package edu.ncu.structure.proxy.dynamic;


import edu.ncu.structure.proxy.RealPlayerService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author HanJing
 */
public class CglibProxy implements MethodInterceptor {


    private RealPlayerService target;

    public CglibProxy(RealPlayerService target) {
        this.target = target;
    }

    public RealPlayerService createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (RealPlayerService) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Proxy: Before operation");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("Proxy: After operation");
        return result;
    }
}
