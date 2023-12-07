import enums.BirdType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird owl = new Bird("Owlus", "Owl", 12, BirdType.predator, 23.6);
        Bird stork = new Bird("Storkus", "Stork", 10, BirdType.singer, 10);
        Reptile iguana = new Reptile("Iguanus", "Iguana", 5, true, 13.3);
        Reptile frog = new Reptile("Frogus", "Frog", 2, true, 10.3);
        Reptile crocodile = new Reptile("Crocodileus", "Crocodile", 7, false, 15.3);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(owl);
        animalList.add(stork);
        animalList.add(iguana);
        animalList.add(frog);
        animalList.add(crocodile);

    }
}