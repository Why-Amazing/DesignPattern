package util;

import org.apache.commons.lang3.StringUtils;

import java.util.ResourceBundle;

/**
 * Created by lazyo on 2018/5/6.
 * 使用ResourceBundle方式来读取properties文件
 * PS:不要加.properties后缀,否则报错
 * PS2:注意初始化的方式
 */
public class PropertiesUtilV3 {
    /*private static ResourceBundle resourceBundle
    static {
        resourceBundle = ResourceBundle.getBundle("factory.properties");
    }*/

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("factory");

    public static String getProperty(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("factory");
        String value = resourceBundle.getString(key);
        return value;
    }

    /**
     * 如果key对应的value为空,则返回默认值
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getProperty(String key,String defaultValue){
        String value = getProperty(key);
        if(StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value;
    }
}
