package strategy;

/**
 * Created by guan on 2/12/17.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with my wings...!");
    }
}
