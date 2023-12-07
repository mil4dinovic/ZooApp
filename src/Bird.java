import enums.BirdType;

public class Bird extends Animal{
    private BirdType birdType;
    private double durationFlight;
    public Bird(BirdType birdType, double durationFlight, String latinName, String localName, int age){
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
    public String tostring(){
        return "Ptica je ova legendarna";
    }
    @Override
    public int compareTo(Bird bird){
        return Double.compare(this.durationFlight, bird.durationFlight);
    }
}
