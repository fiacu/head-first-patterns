package com.fiacu.patterns.factory.chicago;

import com.fiacu.patterns.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() { 
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
 
        toppings.add("Shredded Mozzarella Cheese");
    }
 
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
