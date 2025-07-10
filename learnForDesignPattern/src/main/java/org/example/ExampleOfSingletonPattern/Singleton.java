package org.example.ExampleOfSingletonPattern;

public class Singleton {

    // 방법 1 : getInstance()를 동기화 하기
    /*
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
     */
    // 방법 2 : 처음부터 instance를 만드는 방법
    /*
    private static Singleton uniqueInstance = new Singletone();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
     */
    // 방법 3 : DCL(double-check locking)기법 사용하기
    /*
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
     */
}
