package com.fiacu.patterns.decorator.condiments;

import com.fiacu.patterns.decorator.Beverage;
import com.fiacu.patterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;
    public Whip (Beverage bev) {
        this.beverage = bev;
    }
    
    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", Whip";
    }
}
