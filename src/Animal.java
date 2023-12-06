public abstract class Animal {
    private String latinName;
    private String localName;
    private int age;

    public Animal() {

    }
    public String getLatinName() {
        return latinName;
    }
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    public String getLocalName(){
        return localName;
    }
    public void setLocalName(String localName){
        this.localName = localName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age <= 0) {
            throw new IllegalArgumentException("Age can't be 0");
        }
        this.age = age;
    }
    @Override
    public String toString(){
        return "Zivotinje " + latinName;

    }
}
