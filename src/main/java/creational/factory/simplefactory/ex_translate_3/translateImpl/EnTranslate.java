package creational.factory.simplefactory.ex_translate_3.translateImpl;

import creational.factory.simplefactory.ex_translate_3.translate.Itranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class EnTranslate implements Itranslate {
    @Override
    public String sayText(String str) {
        return "Hello:" + str;
    }
}
