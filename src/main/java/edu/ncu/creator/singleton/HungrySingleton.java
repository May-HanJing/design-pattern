package edu.ncu.creator.singleton;


public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }

    private static class SingletonHolder {
        private static HungrySingleton instance = new HungrySingleton();
    }

    public static HungrySingleton getSingletonInstance() {
        return SingletonHolder.instance;
    }

}

