package org.example;

import org.example.ExampleOfStatePattern.GumballMachine;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();
        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}