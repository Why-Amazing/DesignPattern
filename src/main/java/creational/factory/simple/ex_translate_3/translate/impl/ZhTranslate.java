package creational.factory.simple.ex_translate_3.translate.impl;

import creational.factory.simple.ex_translate_3.translate.Itranslate;

/**
 * Created by lazyo on 2018/5/6.
 */
public class ZhTranslate implements Itranslate {
    @Override
    public String sayText(String str) {
        return "你好:" + str;
    }
}
