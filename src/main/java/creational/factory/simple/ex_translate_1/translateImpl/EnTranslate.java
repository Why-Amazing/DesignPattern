package creational.factory.simple.ex_translate_1.translateImpl;

import creational.factory.simple.ex_translate_1.translate.Itranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class EnTranslate implements Itranslate {
    @Override
    public String sayText(String str) {
        return "Hello:" + str;
    }
}
