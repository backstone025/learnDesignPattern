package org.example.ExampleOfDecoratorPattern.coffeeOrderSystem;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .5;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
