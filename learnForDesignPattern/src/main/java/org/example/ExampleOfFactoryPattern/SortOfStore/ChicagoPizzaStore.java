package org.example.ExampleOfFactoryPattern.SortOfStore;

import org.example.ExampleOfFactoryPattern.Pizza;
import org.example.ExampleOfFactoryPattern.PizzaStore;
import org.example.ExampleOfFactoryPattern.SortOfPizza.*;

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
