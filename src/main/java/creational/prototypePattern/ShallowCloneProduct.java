package creational.prototypePattern;

/**
 * Created by lazyo on 2018/7/8.
 */
public class ShallowCloneProduct implements Cloneable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public ShallowCloneProduct clone(){
        ShallowCloneProduct product = null;
        try {
            product = (ShallowCloneProduct)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
}
