package org.example;

import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.DinerMenu;
import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.PancakeHouseMenu;
import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.Waiteress;
import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.Menu;

public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waiteress waiteress = new Waiteress(pancakeHouseMenu, dinerMenu);

        waiteress.printMenu();
    }
}