package org.example.ExampleOfComposite;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        System.out.println("\n 오리 시뮬레이션 게임 : 무리 (+ composite)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallard_1 = duckFactory.createMallarDuck();
        Quackable mallard_2 = duckFactory.createMallarDuck();
        Quackable mallard_3 = duckFactory.createMallarDuck();
        Quackable mallard_4 = duckFactory.createMallarDuck();

        flockOfMallards.add(mallard_1);
        flockOfMallards.add(mallard_2);
        flockOfMallards.add(mallard_3);
        flockOfMallards.add(mallard_4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n 오리 시뮬레이션 게임 : 전체 무리");
        simulate(flockOfDucks);


        System.out.println("\n 오리 시뮬레이션 게임 : 물오리 무리");
        simulate(flockOfMallards);

        System.out.println("오리가 소리 낸 횟수 : " + QuackCounter.getNumberOfDucks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
