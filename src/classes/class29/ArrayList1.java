package classes.class29;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // Dog d1=new Dog("Niko", "Maltese",7);   -same as below:

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Niko", "Maltese",7));
        dogs.add(new Dog("Jacky", "Persian",5));
        dogs.add(new Dog("Mishka", "Bulldog",15));
        dogs.add(new Dog("Jimmi", "German",10));

        for (Dog d:dogs){
            d.printDogName();
        }

    }
}
