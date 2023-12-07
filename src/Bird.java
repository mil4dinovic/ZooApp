import enums.BirdType;

public class Bird extends Animal implements Comparable<Bird>{
    private BirdType birdType;
    private double durationFlight;
    public Bird(String latinName, String localName, int age, BirdType birdType, double durationFlight){
        super(latinName,localName,age);
        this.birdType = birdType;
        this.durationFlight = durationFlight;
    }

    public BirdType getBirdType() {
        return birdType;
    }
    public void setBirdType(BirdType birdType){
        this.birdType = birdType;
    }
    public double getDurationFlight(){
        return durationFlight;
    }
    public void setDurationFlight(double durationFlight){
        this.durationFlight = durationFlight;
    }
    @Override
    public String toString(){
        return "Ptica je ova legendarna";
    }
    @Override
    public int compareTo(Bird bird){
        return Double.compare(this.durationFlight, bird.durationFlight);
    }
}
