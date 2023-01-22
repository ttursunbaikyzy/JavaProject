package homework.homework7;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name="Snow";
        dog1.breed="Husky";
        dog1.age=2;
        dog1.weight=10;
        dog1.color="White";

        System.out.println(dog1.name+" is a "+dog1.breed);
        dog1.bark();
        dog1.eat();
        dog1.wiggleTail();
        dog1.sleep();

        System.out.println();
        Dog dog2 = new Dog();

        dog2.name="Teddy";
        dog2.breed="Bulldog";
        dog2.age=5;
        dog2.weight=15;
        dog2.color="Black";

        System.out.println(dog2.name+" is a "+dog2.breed);
        dog2.bark();
        dog2.eat();
        dog2.wiggleTail();
        dog2.sleep();

        System.out.println();
        Dog dog3 = new Dog();

        dog3.name="Stella";
        dog3.breed="Labrador";
        dog3.age=4;
        dog3.weight=12;
        dog3.color="Brown";

        System.out.println(dog3.name+" is a "+dog3.breed);
        dog3.bark();
        dog3.eat();
        dog3.wiggleTail();
        dog3.sleep();



    }
}
