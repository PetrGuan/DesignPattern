package singleton;

/**
 * Created by guan on 2/26/17.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
