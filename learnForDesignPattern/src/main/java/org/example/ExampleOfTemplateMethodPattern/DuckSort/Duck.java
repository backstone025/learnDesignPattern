package org.example.ExampleOfTemplateMethodPattern.DuckSort;

import java.util.Comparator;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + " 체중: "+weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return this.weight - otherDuck.weight;
    }
}
