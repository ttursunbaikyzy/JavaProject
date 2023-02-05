package classes.class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuperClass {
    /*SubClass(){
        // super(); << behind scenes // makes a call to the parent class constructor
        System.out.println("I am a child constructor");
    }*/
}
