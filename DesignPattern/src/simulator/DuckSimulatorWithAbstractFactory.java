package simulator;

import adapter.PigeonAdapter;
import factory.CountQuackEchoDuckFactory;
import poultry.Pigeon;
import quack.QuackCounter;
import factory.AbstractDuckFactory;
import adapter.GooseAdapter;
import poultry.Goose;
import quack.Quackable;

public class DuckSimulatorWithAbstractFactory {
    public static void main(String[] args) {
        DuckSimulatorWithAbstractFactory simulator = new DuckSimulatorWithAbstractFactory();
        AbstractDuckFactory duckFactory = new CountQuackEchoDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);

        System.out.println();
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }

}
