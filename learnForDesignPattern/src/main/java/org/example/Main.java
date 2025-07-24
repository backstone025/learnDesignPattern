package org.example;

import org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage.CaffeineBeverage;
import org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage.Coffee;
import org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage.Tea;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("- coffee order -");
        coffee.prepareRecipe();

        System.out.println("\n- tea order -");
        tea.prepareRecipe();
    }
}