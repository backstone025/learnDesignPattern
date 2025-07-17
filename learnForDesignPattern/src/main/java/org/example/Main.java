package org.example;

import org.example.ExampleOfAdapterPattern.Duck.*;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        // 변수를 Duck이 아닌 TurkeyAdpater로 선언해도 된다.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어뎁터가 말하길");
        testDuck(turkeyAdapter);

        System.out.println("\n칠면조가 말하길");
        testTurkey(turkey);

        System.out.println("\n오리 어뎁터가 말하길");
        for (int i = 1; i < 10; i++){
            System.out.println(i+"번째 :");
            testTurkey(duckAdapter);
        }
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    };
}