package factory;

import poultry.DuckCall;
import poultry.MallardDuck;
import poultry.RedHeadDuck;
import poultry.RubberDuck;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class CountQuackEchoDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
