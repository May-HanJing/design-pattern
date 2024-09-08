package edu.ncu.structure.proxy;

import java.util.concurrent.TimeUnit;

public class RealPlayerImpl implements IPlayer {
    @Override
    public void loadVideo(String filename) {
        System.out.println("RealPlayer loadVideo start...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RealPlayer loadVideo end...");
    }

    @Override
    public void playVideo(String filename) {
        System.out.println("RealPlayer playVideo start...");
    }
}
