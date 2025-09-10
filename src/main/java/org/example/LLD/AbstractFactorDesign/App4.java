package org.example.LLD.AbstractFactorDesign;

import org.example.LLD.StatergyPattern.SportsCar;
import org.example.LLD.StatergyPattern.Vehicle;

public class App4
{
    private Button button;

    public App4(GUIFactory factory) {
        button = factory.button();
    }

    public void paintUI() {
        button.createButton();
    }

    public static void main( String[] args )
    {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (osName.contains("mac")) {
            factory = new WindowsFactory();
        } else {
            factory = new WindowsFactory();
        }

        // The application is configured with the specific factory
        App4 app = new App4(factory);
        app.paintUI();
    }
}
