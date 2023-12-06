import enums.Sex;
import exceptions.InvalidDataException;

public class Main {
    public static void main(String[] args) throws InvalidDataException {
        System.out.println("Hello world!");
        Owner owner1 = new Owner("1234567891234","John","Smith", Sex.MALE,19);
        System.out.println(owner1);
}
}