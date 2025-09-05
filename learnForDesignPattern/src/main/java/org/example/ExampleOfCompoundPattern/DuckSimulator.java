package org.example.ExampleOfCompoundPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임 : 무리 (+ composite)");

        // 전체 오리 무리
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        // 물오리 무리
        Flock flockOfMallard = new Flock();

        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();
        Quackable mallard5 = duckFactory.createMallardDuck();

        flockOfMallard.add(mallard1);
        flockOfMallard.add(mallard2);
        flockOfMallard.add(mallard3);
        flockOfMallard.add(mallard4);
        flockOfMallard.add(mallard5);

        flockOfDucks.add(flockOfMallard);

        System.out.println("\n 오리 시뮬레이션 게임 : (+ observer)");

        Qucaklogist qucaklogist = new Qucaklogist();
        flockOfDucks.registerObserver(qucaklogist);

        simulate(flockOfDucks);

        System.out.println("오리가 소리 낸 횟수 : " + QuackCounter.getNumberOfDucks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
