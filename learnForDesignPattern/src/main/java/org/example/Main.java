package org.example;

import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.*;

public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waiteress waiteress = new Waiteress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waiteress.printMenu();
    }
}