package org.example.LLD.Solid.InterfaceSegmentedPrinciple;

public class Chef implements Employee{
    @Override
    public void cookFood() {
        System.out.println("cooking");
    }

    @Override
    public void serveFood() {
        System.out.println("no related");
    }

    @Override
    public void cleanTable() {
        System.out.println("not related");
    }

    // it contains irrelavent menthods that needs to implemented in the chef class as it extends the Employee
    //insterd the employee can be divded in a better way
}
