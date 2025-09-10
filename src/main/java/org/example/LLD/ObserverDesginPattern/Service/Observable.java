package org.example.LLD.ObserverDesginPattern.Service;

import org.example.LLD.ObserverDesginPattern.Model.Display;

public interface Observable {

    public void add(Display display);
    public void remove(Display display);
    public void notifyUsers(int prevt,int currt);
}
