package edu.ncu.structure.proxy;

import edu.ncu.structure.proxy.dynamic.CglibProxy;
import edu.ncu.structure.proxy.dynamic.JDKProxy;

public class ProxyTest {

    /**
     * 代理模式（Proxy Pattern）是用来为其他对象提供一个代理以控制对这个对象的访问。
     * 这种类型的设计模式属于结构型模式。
     * 在代理模式中，我们创建一个用于包含所有与代理相关的类的类目录。
     * 这样，当客户端代码需要访问的类时，它就可以不经过我们的前置了。
     */

    public static void main(String[] args) throws Exception {

       /* RealPlayerImpl realPlayerImpl = new RealPlayerImpl();
        IPlayer player = JDKProxy.getProxy(realPlayerImpl.getClass(), realPlayerImpl);
        player.loadVideo("video1");
        player.playVideo("video1");*/

        /**
         * cglib
         */
        RealPlayerService realService = new RealPlayerService();
        CglibProxy proxy = new CglibProxy(realService);
        RealPlayerService proxyService =  proxy.createProxy();
        proxyService.loadVideo("cgilb");

    }
}
