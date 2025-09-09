package org.example.LLD.StatergyPattern;

public class Vehicle {
    DrivingType dt;
    Vehicle(DrivingType dt){
        this.dt=dt;
    }

    public void driving(){
        dt.driving();
    }


}
