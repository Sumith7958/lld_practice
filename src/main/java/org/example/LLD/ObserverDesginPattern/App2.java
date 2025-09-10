package org.example.LLD.ObserverDesginPattern;

import org.example.LLD.ObserverDesginPattern.Model.Desktop;
import org.example.LLD.ObserverDesginPattern.Model.Mobile;
import org.example.LLD.ObserverDesginPattern.Repo.DisplayRepo;
import org.example.LLD.ObserverDesginPattern.Repo.TempratureChange;
import org.example.LLD.ObserverDesginPattern.Service.ObeserverImplementation;
import org.example.LLD.StatergyPattern.SportsCar;
import org.example.LLD.StatergyPattern.Vehicle;

public class App2
{
    public static void main( String[] args )
    {
        ObeserverImplementation repo=new ObeserverImplementation();
        repo.add(new Desktop());
        repo.add(new Mobile());
        TempratureChange temp=new TempratureChange();
        temp.setTemp(4,repo);
    }
}
