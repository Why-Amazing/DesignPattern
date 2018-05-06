package util;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lazyo on 2018/5/6.
 * 读取配properties文件的工具类V1版
 * 简单实现了从配置文件中读取配置信息的功能,但有两点不足
 * 1.只能读取factory.properties中的配置
 * 2.应该使用静态块初始化,使类加载时就加载配置文件
 * 3.应添加配置项为空时,返回默认值的方法
 */
public class PropertiesUtilV1 {

    public static String getProperty(String key){
        if(StringUtils.isEmpty(key)){
            return null;
        }
        Properties props = new Properties();
        InputStream in = null;
        in = PropertiesUtilV1.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            props.load(in);
            return props.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
