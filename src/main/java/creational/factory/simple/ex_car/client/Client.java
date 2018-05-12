package creational.factory.simple.ex_car.client;

import creational.factory.simple.ex_car.car.ICar;
import creational.factory.simple.ex_car.factory.CarFactory;

/**
 * Created by lazyo on 2018/3/24.
 */
public class Client {
    public static void main(String[] args) {
        ICar car = CarFactory.createCar("Benz");
        car.drive();
    }
}
