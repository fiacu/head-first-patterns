package com.fiacu.patterns.decorator.coffees;

import com.fiacu.patterns.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf () {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }

}
