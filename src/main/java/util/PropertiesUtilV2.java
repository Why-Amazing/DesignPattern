package util;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lazyo on 2018/5/6.
 * 对PropertiesUtilV1的改进
 * 由于实在静态块中初始化,所以只能读取特定的properties文件
 */
public class PropertiesUtilV2 {
    private static Properties prop;
    private static InputStream in;
    static {
        prop = new Properties();
        in = PropertiesUtilV2.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        if(StringUtils.isBlank(key.trim())){
            return null;
        }
        String value = prop.getProperty(key);
        return value.trim();
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
