package classes.class15;

import classes.class16.Person;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        // System.out.println(person.bankBalance); // private variable
        // System.out.println(person.address); // default variable
        System.out.println(person.name); // public variable
        // person.printPhonePassword(); //private method
        // person.printSSN(); // default method
        person.printTikTokAccount(); // public method
    }
}
