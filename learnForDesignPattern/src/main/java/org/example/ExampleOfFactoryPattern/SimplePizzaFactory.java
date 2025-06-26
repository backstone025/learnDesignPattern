package org.example.ExampleOfFactoryPattern;

import org.example.ExampleOfFactoryPattern.SortOfPizza.CheesePizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.ClamPizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.PepperoniPizza;
import org.example.ExampleOfFactoryPattern.SortOfPizza.VeggiePizza;

public class SimplePizzaFactory {
    Pizza pizza = null;

    // createPizza를 static method로 선언하는 경우도 있다.
    public Pizza createPizza(String type) {
        if (type.equals("cheeze")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
