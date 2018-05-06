package creational.factory.simplefactory.ex_translate_1.client;

import creational.factory.simplefactory.ex_translate_1.factory.TranslateFactory;
import creational.factory.simplefactory.ex_translate_1.translate.Itranslate;
import creational.factory.simplefactory.ex_translate_1.translateImpl.ZhTranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class Client {
    public static void main(String[] args) {
        Itranslate itranslate = TranslateFactory.createTranslate("Zh");
        System.out.println(itranslate.sayText("simpleFactory pattern"));
        itranslate = TranslateFactory.createTranslate("En");
        System.out.println(itranslate.sayText("SimpleFactory Pattern"));
    }
}
