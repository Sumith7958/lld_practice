package org.example.LLD.ObserverDesginPattern.Model;

public class Mobile implements Display {
    @Override
    public void update(int prevTemp,int currTemp) {
        System.out.println("Notified on Mobile that Temperature has changed from "+prevTemp+" to "+currTemp);
    }
}
