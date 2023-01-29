package classes.class16;

public class Person {
    private double bankBalance;// can be accessed only within the same class
    String address = "Street 123"; // default class, can be accessed from different classes in the same package
    public String name = "Jon Snow"; // can be accessed anywhere

    private void printPhonePassword() {
        System.out.println("pass123");
    }

    void printSSN() { // default access is assigned automatically
        System.out.println("123456789");
    }

    public void printTikTokAccount() {
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }


}
