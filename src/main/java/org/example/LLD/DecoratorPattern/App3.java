package org.example.LLD.DecoratorPattern;


import org.example.LLD.DecoratorPattern.BasePizzaType.BasePizza2;
import org.example.LLD.DecoratorPattern.ToppingType.Onion;
import org.example.LLD.DecoratorPattern.ToppingType.Tomato;

public class App3
{
    public static void main( String[] args )
    {
        Onion onion=new Onion( new Tomato(new BasePizza2()));
        System.out.println(onion.cost());
    }
}
