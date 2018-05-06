package creational.factory.simplefactory.ex_translate_2.client;

import creational.factory.simplefactory.ex_translate_2.factory.TranslateFactory;
import creational.factory.simplefactory.ex_translate_2.translate.Itranslate;
import creational.factory.simplefactory.ex_translate_2.translateImpl.EnTranslate;
import creational.factory.simplefactory.ex_translate_2.translateImpl.ZhTranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class Client {
    public static void main(String[] args) {
        Itranslate itranslate = TranslateFactory.createTranslate(ZhTranslate.class);
        System.out.println(itranslate.sayText("simpleFactory pattern"));
        itranslate = TranslateFactory.createTranslate(EnTranslate.class);
        System.out.println(itranslate.sayText("SimpleFactory Pattern"));
    }
}
