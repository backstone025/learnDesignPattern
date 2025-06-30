package org.example.ExampleOfFactoryPattern.SortOfPizza;

import org.example.ExampleOfFactoryPattern.Pizza;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "조개 피자";
        dough = "일반 도우";
        sauce = "조개 육수 소스";

        toppings.add("구운 조개");
        toppings.add("바질");
    }
}
