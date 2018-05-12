package creational.factory.simple.ex_translate_3.client;

import creational.factory.simple.ex_translate_3.factory.TranslateFactory;
import creational.factory.simple.ex_translate_3.translate.Itranslate;

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
