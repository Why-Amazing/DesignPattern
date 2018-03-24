package creational.factory.simplefactory.ex_car.carImpl;

import creational.factory.simplefactory.ex_car.car.ICar;

/**
 * Created by lazyo on 2018/3/24.
 */
public class Benz implements ICar {
    @Override
    public void drive() {
        System.out.println("drive Benz");
    }
}
