package org.example.LLD.ObserverDesginPattern.Repo;

import org.example.LLD.ObserverDesginPattern.Service.ObeserverImplementation;

public class TempratureChange {
    private int temp=2;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp,ObeserverImplementation obj) {
        int pretemp=getTemp();
        this.temp = temp;
        obj.notifyUsers(pretemp,temp);
    }
}
