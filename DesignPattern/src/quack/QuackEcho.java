package quack;

public class QuackEcho implements Quackable{
    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        this.echo();
    }

    public void echo(){
        System.out.printf("Echo: ");
        this.duck.quack();
    }
}
