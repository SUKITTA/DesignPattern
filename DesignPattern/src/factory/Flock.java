package factory;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        int numOfDuck = 0;

        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            numOfDuck++;


            if(numOfDuck == 1){
                System.out.println("Leader's Quack!");
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }

            else {
                System.out.printf("Member's Quack: ");
                quacker.quack();
            }
        }
    }
}
