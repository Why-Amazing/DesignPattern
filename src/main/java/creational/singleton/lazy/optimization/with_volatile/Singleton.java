package creational.singleton.lazy.optimization.with_volatile;

/**
 * Created by lazyo on 2018/6/24.
 */
public class Singleton {
    private volatile static Singleton singleton = null;
    private Singleton(){}
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (singleton){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
