package org.example.ExampleOfFactoryPattern.AbstractFactoryPattern;

import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.Ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClame();
}
