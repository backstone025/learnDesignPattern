package org.example.ExampleOfFactoryPattern.AbstractFactoryPattern;

import org.example.ExampleOfFactoryPattern.AbstractFactoryPattern.Ingredient.*;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    abstract protected void  prepare();
    void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    void box(){
        System.out.println("상자에 피자 담기");
    }
    void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
