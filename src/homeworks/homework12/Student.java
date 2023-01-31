package homeworks.homework12;

public class Student {
    /* Task 5:
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student (String sName, String sAddress){
        name=sName;
        address=sAddress;
    }

    void displayInfo () {
        System.out.println(name+" lives at "+address);
    }

    public static void main(String[] args) {
        Student s= new Student("Sam","123 Street");
        s.displayInfo();
    }


}
