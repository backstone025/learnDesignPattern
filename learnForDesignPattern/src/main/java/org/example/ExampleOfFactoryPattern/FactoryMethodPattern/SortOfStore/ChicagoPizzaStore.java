package org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfStore;

import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.ChicagoSytleCheesePizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.ClamPizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.PepperoniPizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza.VeggiePizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.Pizza;
import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoSytleCheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else return null;
    }
}
