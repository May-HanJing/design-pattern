package edu.ncu.structure.bridge;

public class FingerprintMode implements IPayMode {
    @Override
    public boolean security(String uid) {
        System.out.println("fingerprint mode is security");
        return true;
    }
}
