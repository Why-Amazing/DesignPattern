package creational.factory.abstractFactory.ex_translate.factory;

import creational.factory.abstractFactory.ex_translate.product.IInterpret;
import creational.factory.abstractFactory.ex_translate.product.ISpeech;
import creational.factory.abstractFactory.ex_translate.product.ITranslate;

/**
 * Created by lazyo on 2018/7/8.
 */
public abstract class AbstractFactory {
    protected abstract ITranslate createTranslate();
    protected abstract IInterpret createInterpret();
    protected abstract ISpeech createSpeech();

    public void createProduct(){
        ITranslate translate = createTranslate();
        IInterpret interpret = createInterpret();
        ISpeech speech = createSpeech();
        translate.doTranslate();
        interpret.doInterpret();
        speech.doSpeech();
    }
}
