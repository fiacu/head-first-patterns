package com.fiacu.patterns.decorator.condiments;

import com.fiacu.patterns.decorator.Beverage;
import com.fiacu.patterns.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy (Beverage bev) {
        this.beverage = bev;
    }
    
    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", Soy";
    }
}
