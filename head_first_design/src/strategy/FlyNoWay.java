package strategy;

/**
 * Created by guan on 2/12/17.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly sorry!");
    }
}
