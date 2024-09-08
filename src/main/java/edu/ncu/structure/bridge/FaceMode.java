package edu.ncu.structure.bridge;

public class FaceMode implements IPayMode {
    @Override
    public boolean security(String uid) {
        System.out.println("face mode is security");
        return true;
    }
}
