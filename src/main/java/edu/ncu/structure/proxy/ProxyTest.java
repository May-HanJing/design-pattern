package edu.ncu.structure.proxy;

import edu.ncu.structure.proxy.dynamic.CglibProxy;
import edu.ncu.structure.proxy.dynamic.JDKProxy;

public class ProxyTest {

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
