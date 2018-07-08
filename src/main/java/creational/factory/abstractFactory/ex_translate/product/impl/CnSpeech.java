package creational.factory.abstractFactory.ex_translate.product.impl;

import creational.factory.abstractFactory.ex_translate.product.ISpeech;

/**
 * Created by lazyo on 2018/7/8.
 */
public class CnSpeech implements ISpeech {
    @Override
    public void doSpeech() {
        System.out.println("中文朗读");
    }
}
