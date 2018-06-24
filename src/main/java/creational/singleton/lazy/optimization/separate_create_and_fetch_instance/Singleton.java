package creational.singleton.lazy.optimization.separate_create_and_fetch_instance;

/**
 * Created by lazyo on 2018/6/24.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton () {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton ();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
