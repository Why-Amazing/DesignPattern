package creational.factory.simplefactory.ex_translate_3.factory;

import creational.factory.simplefactory.ex_translate_3.translate.Itranslate;
import util.PropertiesUtilV1;
import util.PropertiesUtilV3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lazyo on 2018/5/6.
 * Spring就是使用了工厂模式创建Bean;
 * 仿照Spring,利用properties文件来实现工厂方法
 * PS:使用多种方式从properties文件中读取配置信息
 */
public class TranslateFactory {
    private static Properties props;
    public static Itranslate createTranslateV1(String key){
        props = new Properties();
        InputStream in;
        try {
            in = TranslateFactory.class.getClassLoader().getResourceAsStream("factory.properties");
            props.load(in);
            String className = props.getProperty(key);
            return getTranslate(className);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Itranslate createTranslateV2(String key){
        String className = PropertiesUtilV1.getProperty(key);
        return getTranslate(className);
    }



    public static Itranslate createTranslateV3(String key){
        String className = PropertiesUtilV3.getProperty(key);
        return getTranslate(className);
    }

    private static Itranslate getTranslate(String className) {
        Itranslate itranslate = null;
        try {
            itranslate = (Itranslate) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return itranslate;
    }
}
