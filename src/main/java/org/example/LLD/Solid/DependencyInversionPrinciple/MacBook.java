package org.example.LLD.Solid.DependencyInversionPrinciple;

public class MacBook {
    public Wiredkeyboard wkb;
    public WiredMouse wm;
    public MacBook(Wiredkeyboard wkb,WiredMouse wm){
        this.wkb=wkb;
        this.wm=wm;
    }

    //here in this class we are confining wkb with wiredkeyboard ifblutooth comes we need to change the code there fore its important to change wiredkeyboard->keyboard

}
