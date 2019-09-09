package simulator;

import goose.GooseAdapter;
import goose.Goose;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
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

        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
