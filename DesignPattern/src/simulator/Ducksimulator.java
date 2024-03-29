package simulator;

import adapter.GooseAdapter;
import adapter.PigeonAdapter;
import poultry.*;
import quack.Quackable;


public class Ducksimulator {

    public static void main(String[] args) {
        Ducksimulator simulator = new Ducksimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        System.out.println("\nDuck Simulator");


        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
