package simulator;

import adapter.PigeonAdapter;
import poultry.Pigeon;
import quack.QuackCounter;
import factory.AbstractDuckFactory;
import factory.CountingDuckFactory;
import factory.Flock;
import adapter.GooseAdapter;
import poultry.Goose;
import quack.Quackable;

public class DuckSimulatorWithComposite {
    public static void main(String[] args) {
        DuckSimulatorWithComposite simulator = new DuckSimulatorWithComposite();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Composite - Flock");

        Flock flockOfDuck = new Flock();

        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);
        flockOfDuck.add(pigeon);

//        Flock flockOfMallard = new Flock();
//
//        Quackable mallardDuckOne = duckFactory.createMallardDuck();
//        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
//        Quackable mallardDuckThree = duckFactory.createMallardDuck();
//        Quackable mallardDuckFour = duckFactory.createMallardDuck();
//
//        flockOfMallard.add(mallardDuckOne);
//        flockOfMallard.add(mallardDuckTwo);
//        flockOfMallard.add(mallardDuckThree);
//        flockOfMallard.add(mallardDuckFour);
//
//        flockOfDuck.add(flockOfMallard);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDuck);
//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallard);

        System.out.println();
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}

