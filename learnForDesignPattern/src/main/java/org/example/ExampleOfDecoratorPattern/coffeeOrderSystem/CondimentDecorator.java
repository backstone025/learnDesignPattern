package org.example.ExampleOfDecoratorPattern.coffeeOrderSystem;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public abstract Size getSize();
}
