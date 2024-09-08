package edu.ncu.structure.bridge;

public class PwdMode implements IPayMode {
    @Override
    public boolean security(String uid) {
        System.out.println("pwd mode is security");
        return true;
    }
}
