package org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.SortOfPizza;

import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.PizzaIngredientFactory;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.Pizza;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
