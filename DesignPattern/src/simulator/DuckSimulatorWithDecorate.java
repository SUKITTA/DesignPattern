package simulator;

import quack.QuackCounter;
import poultry.*;
import adapter.GooseAdapter;
import quack.QuackEcho;
import quack.Quackable;

public class DuckSimulatorWithDecorate {

    public static void main(String[] args) {
        DuckSimulatorWithDecorate simulator = new DuckSimulatorWithDecorate();

        simulator.simulate();
    }

    void simulate() {
//        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
//        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedHeadDuck()));
//        Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
//        Quackable rubberDuck = new QuackEcho(new QuackCounter(new RubberDuck()));
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        System.out.println("\nDuck Simulator : With Decorate");
//      ------------------- count all quack even echo ---------------------------------



        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedHeadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator : With Decorate");
//      ------------------- count all quack except echo ---------------------------------

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println();
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
