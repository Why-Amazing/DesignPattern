package creational.singleton.lazy;

/**
 * 单线程没有问题,多线程下会出现问题
 * Created by lazyo on 2018/5/12.
 */
public class Singleton {
    // 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton instance = null;

    // 私有化构造函数,防止对象被外部对象构造
    private Singleton(){}

    // 静态工程方法，创建实例
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve(){
        return instance;
    }
}
