package creational.factory.method.ex_translate.translate.impl;


import creational.factory.method.ex_translate.translate.ITranslate;

/**
 * Created by lazyo on 2018/5/12.
 */
public class ZhTranslate implements ITranslate {

    @Override
    public String sayText(String str) {
        return "你好" + str;
    }
}
