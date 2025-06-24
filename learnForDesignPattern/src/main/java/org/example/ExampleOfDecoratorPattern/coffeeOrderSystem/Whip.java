package org.example.ExampleOfDecoratorPattern.coffeeOrderSystem;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
