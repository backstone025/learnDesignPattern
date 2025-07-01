package org.example;

import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.Pizza;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.PizzaStore;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.NYPizzaStore;
import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.ChicagoPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

         Pizza pizza = nyStore.orderPizza("cheese");
         System.out.println("에단이 주문한" + pizza.getName()+"\n");

         pizza = chicagoStore.orderPizza("cheese");
         System.out.println("조엘이 주문한" + pizza.getName()+"\n");
    }
}