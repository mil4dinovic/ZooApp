public class Reptile extends Animal{
    private boolean poisonous;
    private double bodyTemp;
    public Reptile(String latinName, String localName, int age, boolean poisonous, double bodyTemp){
        super(latinName,localName,age);
        this.poisonous = poisonous;
        this.bodyTemp = bodyTemp;

    }
    public boolean isPoisonous(){
        return poisonous;
    }
    public void setPoisonous(boolean poisonous){
        this.poisonous = poisonous;
    }
    public double getBodyTemp(){
        return bodyTemp;
    }
    public void setBodyTemp(double bodyTemp){
        this.bodyTemp = bodyTemp;
    }
    public String toString(){
        return "Ovo su gmizavci legende";
    }
    public int CompareTo(Reptile reptile){
        if (this.poisonous && !reptile.poisonous) {
            return 1;
        } else if (this.poisonous == reptile.poisonous) {
            if (this.bodyTemp == reptile.bodyTemp){
                return 0;
            } else if (this.bodyTemp > reptile.bodyTemp) {
                return 1;
            }
        }
        return -1;
    }


}




