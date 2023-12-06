import enums.Sex;
import exceptions.InvalidDataException;

public class Owner {
    private String jmbg;
    private String name;
    private String surname;
    private Sex sex;
    private int age;

    public Owner(){

    }
    public Owner(String jmbg, String name, String surname, Sex sex, int age) throws InvalidDataException {
        setJmbg(jmbg);
        setName(name);
        setSurname(surname);
        setSex(sex);
        setAge(age);
    }
    public String getJmbg() {
        return jmbg;
    }
    public void setJmbg(String jmbg) throws InvalidDataException {
        if (jmbg.length() == 13) {
            this.jmbg = jmbg;
        }else {
            throw new InvalidDataException(
                    "JMBG mora da ima 13 cifara!");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name can only contain letters.");
        }
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Surname can only contain letters.");
        }
        this.surname = surname;
    }
    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidDataException {
        if(age >= 18){
            this.age = age;
        }else {
            throw new InvalidDataException("Age must be > 18!");
        }
    }
    @Override
    public String toString(){
        return "Vlasnik { jmbg " + jmbg;
    }

}
