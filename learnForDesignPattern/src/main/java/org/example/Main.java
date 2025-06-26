package org.example;

import org.example.ExampleOfDecoratorPattern.JavaIODecorator.*;
import org.example.ExampleOfFactoryPattern.PizzaStore;
import org.example.ExampleOfFactoryPattern.SimplePizzaFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        pizzaStore.orderPizza("cheeze");
    }
}