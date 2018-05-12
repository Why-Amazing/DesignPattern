package creational.singleton.hungry;

/**
 * Created by lazyo on 2018/5/12.
 */
public class Singleton {
    // 持有私有静态实例，防止被引用
    private static Singleton instance = new Singleton();

    // 私有化构造函数,防止对象被外部对象构造
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
