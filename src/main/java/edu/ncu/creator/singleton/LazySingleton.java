package edu.ncu.creator.singleton;

import cn.hutool.core.util.ObjectUtil;

public class LazySingleton {
    private static LazySingleton singleton;

    public static LazySingleton getSingleton(){
        if(ObjectUtil.isEmpty(singleton)){
            return new LazySingleton();
        }
        return singleton;
    }

    public static synchronized  LazySingleton getSafeSingleton(){
        if(ObjectUtil.isEmpty(singleton)){
            return new LazySingleton();
        }
        return singleton;
    }

    public LazySingleton() {
    }
}
