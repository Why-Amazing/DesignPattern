package creational.singleton.lazy.optimization.double_checked_locking;

/**
 * 使用双重检测锁机制优化
 * Created by lazyo on 2018/6/24.
 */
public class Singleton {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            // 同步机制放在产生实例的代码前
            synchronized (instance) {
                if (instance == null) { //对是否为null再次判断,否则会有跟未加锁之前一样的问题
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

}
