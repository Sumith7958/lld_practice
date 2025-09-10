package org.example.LLD.ObserverDesginPattern.Model;

public class Desktop implements Display {
    @Override
    public void update(int prevTemp,int currTemp) {
        System.out.println("Notified on Desktop that Temperature has changed from "+prevTemp+" to "+currTemp);
    }
}
