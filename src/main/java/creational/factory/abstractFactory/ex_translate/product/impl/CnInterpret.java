package creational.factory.abstractFactory.ex_translate.product.impl;

import creational.factory.abstractFactory.ex_translate.product.IInterpret;

/**
 * Created by lazyo on 2018/7/8.
 */
public class CnInterpret implements IInterpret {
    @Override
    public void doInterpret() {
        System.out.println("中文语义");
    }
}
