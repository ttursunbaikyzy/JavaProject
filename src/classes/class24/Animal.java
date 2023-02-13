package classes.class24;

public abstract class Animal {
    /*
    define the speak eat method and create 3 subclasses and override the speak eat methods
     */
    abstract void speak();
    abstract void eat();
    void sleep(){
        System.out.println("Animal sleep 5-8 hours");
    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("Woof woof");
    }
    void eat(){
        System.out.println("Dog eats meat");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow");
    }
    void eat(){
        System.out.println("Cat eats fish");
    }
}

class Bird extends Animal{
    void speak(){
        System.out.println("Tweet tweet");
    }
    void eat(){
        System.out.println("Bird eats seeds");
    }
}
