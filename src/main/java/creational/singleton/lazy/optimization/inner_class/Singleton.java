package creational.singleton.lazy.optimization.inner_class;

/**
 * JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），
 * 会执行类的初始化。在执行类的初始化期间，JVM会去获取一个锁。
 * 这个锁可以同步多个线程对同一个类的初始化。
 * 基于这个特性，可以实现另一种线程安全的延迟初始化方案（这个方案被称之为
 * Initialization On Demand Holder idiom）
 * Created by lazyo on 2018/6/24.
 */
public class Singleton {

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

}
