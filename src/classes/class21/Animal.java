package classes.class21;

public class Animal {
    String name;
    String color="Black";
}

class Cat extends Animal {
    String color="White";
    int age=10;
    double weight;
    void printColor(){
        String color="Blue";
        System.out.println(color); // blue
        System.out.println(this.color); // white
        System.out.println(super.color); // black
    }
}


