package com.fiacu.patterns.decorator.condiments;

import com.fiacu.patterns.decorator.Beverage;
import com.fiacu.patterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha (Beverage bev) {
        this.beverage = bev;
    }
    
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", Mocha";
    }
}
