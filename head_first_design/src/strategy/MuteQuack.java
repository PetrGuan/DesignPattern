package strategy;

/**
 * Created by guan on 2/12/17.
 */

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}