package org.example.LLD.ObserverDesginPattern.Service;

import org.example.LLD.ObserverDesginPattern.Model.Desktop;
import org.example.LLD.ObserverDesginPattern.Model.Display;
import org.example.LLD.ObserverDesginPattern.Repo.DisplayRepo;

public class ObeserverImplementation implements Observable{

    DisplayRepo displayRepo=new DisplayRepo();

    @Override
    public void add(Display display) {
        displayRepo.addDisplay(display);
    }

    @Override
    public void remove(Display display) {
        displayRepo.removeDisplay(display);
    }

    @Override
    public void notifyUsers(int prevTemp,int currTemp) {
        displayRepo.notifyUsers(prevTemp,currTemp);
    }

}
