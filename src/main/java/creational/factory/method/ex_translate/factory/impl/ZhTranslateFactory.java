package creational.factory.method.ex_translate.factory.impl;

import creational.factory.method.ex_translate.factory.ITranslateFactory;
import creational.factory.method.ex_translate.translate.ITranslate;
import creational.factory.method.ex_translate.translate.impl.ZhTranslate;

/**
 * Created by lazyo on 2018/5/12.
 */
public class ZhTranslateFactory implements ITranslateFactory {
    @Override
    public ITranslate createTranslate() {
        return new ZhTranslate();
    }
}
