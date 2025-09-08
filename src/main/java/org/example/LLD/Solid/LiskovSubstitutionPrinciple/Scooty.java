package org.example.LLD.Solid.LiskovSubstitutionPrinciple;

public class Scooty implements Bike{
    @Override
    public void startEngine() {
        System.out.println("started");
    }

    @Override
    public void speed() {
        System.out.println("current speed");
    }
}
