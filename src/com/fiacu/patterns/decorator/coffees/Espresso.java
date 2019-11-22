package com.fiacu.patterns.decorator.coffees;

import com.fiacu.patterns.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso () {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
