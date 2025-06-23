package org.example.ExampleOfDecoratorPattern.coffeeOrderSystem;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;
    public abstract String getDescription();
}
