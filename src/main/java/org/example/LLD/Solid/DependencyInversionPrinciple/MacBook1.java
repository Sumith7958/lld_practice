package org.example.LLD.Solid.DependencyInversionPrinciple;

public class MacBook1 {
    public KeyBoard kb;
    public  Mouse m;
    public MacBook1(Wiredkeyboard kb, WiredMouse m){
        this.kb=kb;
        this.m=m;
    }

    //here in this class we are confining wkb with wiredkeyboard ifblutooth comes we need to change the code there fore its important to change wiredkeyboard->keyboard

}
