package org.example;

import org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage.Coffee;
import org.example.ExampleOfTemplateMethodPattern.CaffeineBeverage.Tea;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("- coffee recipe -");
        coffee.boilWater();
        coffee.brew();
        coffee.pourInCup();
        coffee.addCondiments();

        System.out.println("\n- tea recipe -");
        tea.boilWater();
        tea.brew();
        tea.pourInCup();
        tea.addCondiments();
    }
}