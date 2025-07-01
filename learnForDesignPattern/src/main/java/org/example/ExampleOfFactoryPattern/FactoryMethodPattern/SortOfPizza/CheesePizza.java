package org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza;

import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.Pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "치즈 피자";
        dough = "보통 도우";
        sauce = "토마토 소스";

        toppings.add("모짜렐라 치즈");
    }
}
