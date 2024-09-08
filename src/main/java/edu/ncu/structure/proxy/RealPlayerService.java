package edu.ncu.structure.proxy;

import java.util.concurrent.TimeUnit;

public class RealPlayerService {

    public void loadVideo(String filename){
        System.out.println("RealPlayerService loadVideo start...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RealPlayerService loadVideo end...");
    }
}
