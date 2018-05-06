package creational.factory.simplefactory.ex_translate_2.factory;

import creational.factory.simplefactory.ex_translate_2.translate.Itranslate;

/**
 * Created by lazyo on 2018/5/6.
 * 利用反射技术,减少if判断语句
 */
public class TranslateFactory {
    public static Itranslate createTranslate(Class clazz){
        Itranslate itranslate = null;
        try {
            itranslate = (Itranslate) clazz.newInstance();
            return itranslate;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return itranslate;
    }
}
