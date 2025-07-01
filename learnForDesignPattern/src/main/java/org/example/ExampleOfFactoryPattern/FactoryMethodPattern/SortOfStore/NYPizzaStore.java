package org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfStore;

import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.Pizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.PizzaStore;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.ClamPizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.NYStyleCheesePizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.PepperoniPizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else return null;
    }
}
