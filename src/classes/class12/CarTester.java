package classes.class12;

public class CarTester {
    public static void main(String[] args) {

        // Create the object of the class
        Car bmw = new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.moveForward();
        bmw.applyBrakes();

        Car audi = new Car();
        bmw.make="Audi";
        bmw.model="E-tron";
        bmw.year=2022;
        bmw.color="Black";
        bmw.moveForward();
        bmw.applyBrakes();

    }
}
