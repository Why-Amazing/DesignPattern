package creational.factory.abstractFactory.ex_translate.factory.extend;

import creational.factory.abstractFactory.ex_translate.factory.AbstractFactory;
import creational.factory.abstractFactory.ex_translate.product.IInterpret;
import creational.factory.abstractFactory.ex_translate.product.ISpeech;
import creational.factory.abstractFactory.ex_translate.product.ITranslate;
import creational.factory.abstractFactory.ex_translate.product.impl.CnInterpret;
import creational.factory.abstractFactory.ex_translate.product.impl.CnSpeech;
import creational.factory.abstractFactory.ex_translate.product.impl.CnTranslate;

/**
 * Created by lazyo on 2018/7/8.
 */
public class CnFactory extends AbstractFactory {
    @Override
    protected ITranslate createTranslate() {
        return new CnTranslate();
    }

    @Override
    protected IInterpret createInterpret() {
        return new CnInterpret();
    }

    @Override
    protected ISpeech createSpeech() {
        return new CnSpeech();
    }
}
