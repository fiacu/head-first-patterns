package com.fiacu.patterns.decorator.coffees;

import com.fiacu.patterns.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend () {
        description = "House Blend";
    }
    @Override
    public double cost() {
        return 0.89;
    }

}
