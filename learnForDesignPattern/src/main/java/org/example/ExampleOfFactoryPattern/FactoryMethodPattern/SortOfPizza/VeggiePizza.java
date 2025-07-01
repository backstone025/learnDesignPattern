package org.example.ExampleOfFactoryPattern.FactoryMethodPattern.SortOfPizza;

import org.example.ExampleOfFactoryPattern.FactoryMethodPattern.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "야채 피자";
        dough = "유기농 밀 도우";
        sauce = "토마토 소스";

        toppings.add("콜리플라워");
        toppings.add("콩고기");
    }
}
