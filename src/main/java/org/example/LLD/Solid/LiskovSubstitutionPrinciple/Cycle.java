package org.example.LLD.Solid.LiskovSubstitutionPrinciple;

public class Cycle implements Bike{
    @Override
    public void startEngine() {
        throw new AssertionError("Cycle doest have engine");
    }

    @Override
    public void speed() {

    }

    // here the startengine is not required and we are trying to implement it whic is wrong fundamentally instered we need to craete
    //2 interface which implemnts locomative with ingine and with out engine ad satrt implemnting those further
}
