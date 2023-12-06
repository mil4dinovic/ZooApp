import exceptions.InvalidDataException;

public class Zoo {
    private String name;
    private String address;
    private String city;

    public Zoo(){
    }
    public Zoo(String name, String address, String city){

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
                    throw new InvalidDataException("Name not valid");
        }

    }

}



