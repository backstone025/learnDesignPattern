package org.example;

import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.DinerMenu;
import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.PancakeHouseMenu;
import org.example.ExampleOfIteratorPattern.MergedRestaurantSystem.Waiteress;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waiteress waiteress = new Waiteress(pancakeHouseMenu, dinerMenu);

        waiteress.printMenu();
    }
}