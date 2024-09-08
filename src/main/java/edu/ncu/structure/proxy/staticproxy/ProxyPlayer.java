package edu.ncu.structure.proxy.staticproxy;

import edu.ncu.structure.proxy.IPlayer;
import edu.ncu.structure.proxy.RealPlayerImpl;

public class ProxyPlayer implements IPlayer {

    private RealPlayerImpl realPlayerImpl;

    public ProxyPlayer(RealPlayerImpl realPlayerImpl) {
        this.realPlayerImpl = realPlayerImpl;
    }

    @Override
    public void loadVideo(String filename) {
         realPlayerImpl.loadVideo(filename);
    }

    @Override
    public void playVideo(String filename) {
        realPlayerImpl.playVideo(filename);
    }
}
