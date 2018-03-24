package creational.factory.simplefactory.ex_car.factory;

import creational.factory.simplefactory.ex_car.car.ICar;
import creational.factory.simplefactory.ex_car.carImpl.Benz;
import creational.factory.simplefactory.ex_car.carImpl.Bmw;

/**
 * Created by lazyo on 2018/3/24.
 */
public class CarFactory {
    public static ICar createCar(String carName){
        if(carName == "Benz"){
            Benz benzCar = new Benz();
            return benzCar;
        }if(carName == "Bwm"){
            Bmw bmwCar = new Bmw();
            return bmwCar;
        }
        return null;
    }
}
