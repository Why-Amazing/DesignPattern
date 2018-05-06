package creational.factory.simplefactory.ex_translate_3.client;

import creational.factory.simplefactory.ex_translate_3.factory.TranslateFactory;
import creational.factory.simplefactory.ex_translate_3.translate.Itranslate;
import creational.factory.simplefactory.ex_translate_3.translateImpl.EnTranslate;
import creational.factory.simplefactory.ex_translate_3.translateImpl.ZhTranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class Client {
    public static void main(String[] args) {
        Itranslate itranslate = TranslateFactory.createTranslateV1("Zh.class");
        System.out.println(itranslate.sayText("simpleFactory pattern"));
        itranslate = TranslateFactory.createTranslateV2("En.class");
        System.out.println(itranslate.sayText("SimpleFactory Pattern"));
    }
}
