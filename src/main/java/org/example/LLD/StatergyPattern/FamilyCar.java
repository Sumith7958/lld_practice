package org.example.LLD.StatergyPattern;

public class FamilyCar extends Vehicle{

    FamilyCar(){
        super(new LowEndDriving());
    }

}
