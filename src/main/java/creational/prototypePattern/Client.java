package creational.prototypePattern;


import java.io.IOException;

/**
 * Created by lazyo on 2018/7/8.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getShallowProduct();
        System.out.println("\n");
        getDeepProductA();
        System.out.println("\n");
        getDeepProductB();

    }

    private static void getShallowProduct() {
        ShallowCloneProduct product = new ShallowCloneProduct();
        Address address = new Address();
        product.setName("product A");
        address.setAdd("add A");
        product.setAddress(address);

        System.out.println("prototype : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        ShallowCloneProduct product1 = product.clone();

        System.out.println("clone : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        product1.setName("product B");
        product1.getAddress().setAdd("add B");
        System.out.println("修改后的原对象 : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());
        System.out.println("修改后的浅克隆对象 : name-->" + product1.getName() + ",address-->" + product1.getAddress().getAdd());
    }

    private static void getDeepProductA() {
        DeepCloneProductA product = new DeepCloneProductA();
        Address address = new Address();
        product.setName("product A");
        address.setAdd("add A");
        product.setAddress(address);

        System.out.println("prototype : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        DeepCloneProductA product1 = product.clone();

        System.out.println("clone : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        product1.setName("product B");
        product1.getAddress().setAdd("add B");
        System.out.println("修改后的原对象 : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());
        System.out.println("修改后的深克隆对象A : name-->" + product1.getName() + ",address-->" + product1.getAddress().getAdd());
    }

    private static void getDeepProductB() throws IOException, ClassNotFoundException {
        DeepCloneProductB product = new DeepCloneProductB();
        Address address = new Address();
        product.setName("product A");
        address.setAdd("add A");
        product.setAddress(address);

        System.out.println("prototype : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        DeepCloneProductB product1 = (DeepCloneProductB)product.deepClone();

        System.out.println("clone : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());

        product1.setName("product B");
        product1.getAddress().setAdd("add B");
        System.out.println("修改后的原对象 : name-->" + product.getName() + ",address-->" + product.getAddress().getAdd());
        System.out.println("修改后的深克隆对象B : name-->" + product1.getName() + ",address-->" + product1.getAddress().getAdd());
    }
}
