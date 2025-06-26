package org.example.ExampleOfFactoryPattern;

public abstract class Pizza {
    public void prepare(){
        System.out.println("재료 없음");
    }
    public void bake(){
        System.out.println("작동 안함");
    }
    public void cut(){
        System.out.println("자르지 않음");
    }
    public void box(){
        System.out.println("포장 안함");
    }
}
