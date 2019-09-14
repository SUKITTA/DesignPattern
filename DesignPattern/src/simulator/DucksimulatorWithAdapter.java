package simulator;

import adapter.GooseAdapter;
import adapter.PigeonAdapter;
import poultry.*;
import quack.Quackable;


public class DucksimulatorWithAdapter {

    public static void main(String[] args) {
        DucksimulatorWithAdapter simulator = new DucksimulatorWithAdapter();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator : With Adapter");


        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
