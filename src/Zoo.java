import exceptions.InvalidDataException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String address;
    private String city;
    private Owner owner;
    private List<Animal> animalList = new ArrayList<>();

    public Zoo(){
    }
    public Zoo(String name, String address, String city) throws InvalidDataException {
        setName(name);
        setAddress(address);
        setCity(city);

    }
    public String getName(){
        return name;
    }
    public void setName(String name) throws InvalidDataException {
        if (name.length() >= 5
                && Character.isUpperCase(name.charAt(0))
                && Character.isLowerCase(name.charAt(1))) {
                    this.name = name;
        } else {
                    throw new InvalidDataException("Name is not valid");
        }
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = this.address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public Owner getOwner(){
        return owner;
    }

}



