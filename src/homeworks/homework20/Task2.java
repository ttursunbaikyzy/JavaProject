package homeworks.homework20;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*
        2) Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order.
        In that map store personId and a Person Object. Print each object details.
         */

        Map<Integer,Person>usersMap=new TreeMap<>();
        usersMap.put(646846516,new Person("Sam","Estaniss",33,200000));
        usersMap.put(351387638,new Person("Tami","Estaniss",22,220000));
        usersMap.put(918588987,new Person("John","Smith",45,150000));
        usersMap.put(928989774,new Person("Jackie","James",25,100000));
        usersMap.put(882829913,new Person("Niko","Doe",50,175000));

        var users=usersMap.entrySet();
        for(var user:users){
            System.out.print(user.getKey()+" : ");
            user.getValue().display();
        }

    }
}

class Person{
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void display(){
        System.out.println(name+" "+lastName+" is "+age+" years old "+" and salary is "+salary);
    }

}
