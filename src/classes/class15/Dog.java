package classes.class15;

public class Dog {

    String name; // instance variable, inside a class but outside of methods
    String breed; // instance variable
    String color; // instance variable

    static int noOfLegs=4; // static variable, outside of methods but inside a class
    void printFood () {
        String food="Meat"; //local variable, inside a block of code like a method, loop, if condition etc.
        System.out.println(food);
    }
    void printColor(){
        // System.out.println(food); error because food is local, doesn't exist outside of printFood block
        System.out.println(name);
    }

}
