package org.example.ExampleOfFactoryPattern.AbstractFactoryPattern;

import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.SortOfPizza.CheesePizza;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.SortOfPizza.ClamPizza;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.SortOfPizza.PepperoniPizza;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.SortOfPizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngridientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("시카고 스타일 치즈피자");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("시카고 스타일 야채 피자");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("시카고 스타일 조개 피자");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("시카고 스타일 페페로니 피자");
        }
        return pizza;
    }
}
