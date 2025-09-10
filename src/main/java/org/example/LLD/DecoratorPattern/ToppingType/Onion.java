package org.example.LLD.DecoratorPattern.ToppingType;
import org.example.LLD.DecoratorPattern.BasePizza;
import org.example.LLD.DecoratorPattern.Topping;

public class Onion extends Topping {
    BasePizza basepizza;

    public Onion(BasePizza basepizza) {
        this.basepizza = basepizza;
    }

    @Override
    public int cost() {
        return basepizza.cost()+2;
    }
}
