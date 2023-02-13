package classes.class24;

public class AnimalTester {
    public static void main(String[] args) {
        // Animal animal=new Animal(); >> cannot create object of an abstract class
        // animal.speak();

        Animal[] arr={new Dog(), new Cat(), new Bird()};
        for (Animal animal:arr){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
    }
}
