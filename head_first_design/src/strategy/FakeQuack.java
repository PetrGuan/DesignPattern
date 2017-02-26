package strategy;

/**
 * Created by guan on 2/12/17.
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
