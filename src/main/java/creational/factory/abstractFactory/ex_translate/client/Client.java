package creational.factory.abstractFactory.ex_translate.client;

import creational.factory.abstractFactory.ex_translate.factory.AbstractFactory;
import creational.factory.abstractFactory.ex_translate.factory.extend.CnFactory;
import creational.factory.abstractFactory.ex_translate.factory.extend.EnFactory;

/**
 * Created by lazyo on 2018/7/8.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new CnFactory();
        factory.createProduct();

        factory = new EnFactory();
        factory.createProduct();
    }
}
