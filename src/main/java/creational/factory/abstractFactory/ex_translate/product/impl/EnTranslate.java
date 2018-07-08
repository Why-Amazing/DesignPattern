package creational.factory.abstractFactory.ex_translate.product.impl;

import creational.factory.abstractFactory.ex_translate.product.ITranslate;

/**
 * Created by lazyo on 2018/7/8.
 */
public class EnTranslate implements ITranslate {
    @Override
    public void doTranslate() {
        System.out.println("Hello!");
    }
}
