package com.fiacu.patterns.factory.chicago;

import com.fiacu.patterns.factory.Pizza;
import com.fiacu.patterns.factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
                return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
                return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
                return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
                return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
