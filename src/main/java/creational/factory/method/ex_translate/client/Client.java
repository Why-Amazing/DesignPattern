package creational.factory.method.ex_translate.client;

import creational.factory.method.ex_translate.factory.ITranslateFactory;
import creational.factory.method.ex_translate.factory.impl.EnTranslateFactory;
import creational.factory.method.ex_translate.factory.impl.ZhTranslateFactory;
import creational.factory.method.ex_translate.translate.ITranslate;

/**
 * Created by lazyo on 2018/5/12.
 */
public class Client {
    public static void main(String[] args){
        ITranslateFactory factory = new ZhTranslateFactory();
        ITranslate translate = factory.createTranslate();
        System.out.println(translate.sayText("factory method pattern"));

        factory = new EnTranslateFactory();
        translate = factory.createTranslate();
        System.out.println(translate.sayText("factory method pattern"));
    }
}
