package creational.prototypePattern;

import java.io.Serializable;

/**
 * Created by lazyo on 2018/7/8.
 */
public class Address implements Cloneable,Serializable {
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public Address clone(){
        Address address = null;
        try {
            address = (Address)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return address;
    }
}
