package org.example.ExampleOfFactoryPattern.SortOfStore;

import org.example.ExampleOfFactoryPattern.Pizza;
import org.example.ExampleOfFactoryPattern.PizzaStore;
import org.example.ExampleOfFactoryPattern.SortOfPizza.ClamPizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.NYStyleCheesePizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.PepperoniPizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.VeggiePizza;

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
