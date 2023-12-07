import enums.FoodType;

public class Mammal extends Animal {
    private boolean domesticated;
    private FoodType foodType;

    public Mammal(String latinName, String localName, int age, boolean domesticated, FoodType foodType){
        super(latinName,localName,age);
        this.foodType = foodType;
        this.domesticated = domesticated;
    }
    public FoodType getFoodType(){
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public boolean isDomesticated() {
        return domesticated;
    }
    public void setDomesticated(boolean domesticated){
        this.domesticated = domesticated;
    }
    @Override
    public String toString(){
        return "Mammals are legends";
    }
}
