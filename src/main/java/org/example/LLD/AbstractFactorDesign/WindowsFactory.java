package org.example.LLD.AbstractFactorDesign;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button button() {
        return new WindowsButton();
    }
}