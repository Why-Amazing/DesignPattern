package creational.factory.abstractFactory.ex_translate.factory.extend;

import creational.factory.abstractFactory.ex_translate.factory.AbstractFactory;
import creational.factory.abstractFactory.ex_translate.product.IInterpret;
import creational.factory.abstractFactory.ex_translate.product.ISpeech;
import creational.factory.abstractFactory.ex_translate.product.ITranslate;
import creational.factory.abstractFactory.ex_translate.product.impl.EnInterpret;
import creational.factory.abstractFactory.ex_translate.product.impl.EnSpeech;
import creational.factory.abstractFactory.ex_translate.product.impl.EnTranslate;

/**
 * Created by lazyo on 2018/7/8.
 */
public class EnFactory extends AbstractFactory {
    @Override
    protected ITranslate createTranslate() {
        return new EnTranslate();
    }

    @Override
    protected IInterpret createInterpret() {
        return new EnInterpret();
    }

    @Override
    protected ISpeech createSpeech() {
        return new EnSpeech();
    }
}
