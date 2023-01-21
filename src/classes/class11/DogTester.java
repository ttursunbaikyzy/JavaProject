package classes.class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        // creating an actual object from the class Scanner
        // Scanner scanner = new Scanner(System.in);

        // This is how we create the objects of a class

        Dog dog1= new Dog();

        dog1.name="Nickou";
        dog1.breed="Maltese";
        dog1.age=7;

        dog1.sleep();
        dog1.bark();





    }
}
