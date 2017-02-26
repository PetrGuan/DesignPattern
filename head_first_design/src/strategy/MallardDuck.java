package strategy;

/**
 * Created by guan on 2/12/17.
 */


public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}