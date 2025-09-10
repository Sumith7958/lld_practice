package org.example.LLD.DecoratorPattern.ToppingType;
import org.example.LLD.DecoratorPattern.BasePizza;
import org.example.LLD.DecoratorPattern.Topping;

public class Tomato extends Topping {

    BasePizza basePizza;

    public Tomato(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+  3;
    }
}
