package classes.class19;

public class Donkey {

    String name;
    int age;
    double weight;

    /*Donkey(){
        System.out.println("This is non argument constructor");
    }*/

    Donkey(String name, int age){
        this.name=name;
        this.age=age;
    }

    void print () {
        System.out.println("Donkey name is "+name+" age is "+age+" and weight is "+weight);
    }

}
