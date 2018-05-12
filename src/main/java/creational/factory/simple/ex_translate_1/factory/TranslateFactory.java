package creational.factory.simple.ex_translate_1.factory;

import creational.factory.simple.ex_translate_1.translate.Itranslate;
import creational.factory.simple.ex_translate_1.translateImpl.EnTranslate;
import creational.factory.simple.ex_translate_1.translateImpl.ZhTranslate;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by lazyo on 2018/5/6.
 * 简单工厂模式的应用
 */
public class TranslateFactory {
    public static Itranslate createTranslate(String translateName){
        if(StringUtils.equals("Zh",translateName)){
            return new ZhTranslate();
        }else if(StringUtils.equals("En",translateName)){
            return new EnTranslate();
        }
        return null;
    }
}
