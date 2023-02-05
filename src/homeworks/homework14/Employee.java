package homeworks.homework14;

public class Employee {
    /*
    Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
     */

    String name, id;
    String company="Syntax Technologies";

    Employee(String name, String id){
        this.name=name;
        this.id = id;
    }

    void printInfo (){
        System.out.println("Employee: "+name+", ID: "+ id);
    }

    void print(){
        System.out.println(name+" is a great employee, he works hard at "+company);
    }

}

class FullTime extends Employee {
    String startDate;
    FullTime(String name, String id, String startDate){
        super(name,id);
        this.startDate=startDate;
    }

    void printStartDate(){
        print();
        System.out.println(name+" is a full time employee and works at "+super.company+" since "+startDate);
    }
}

class PartTime extends Employee {
    String schedule;
    PartTime(String name, String id, String schedule){
        super(name,id);
        this.schedule=schedule;
    }

    void printSchedule(){
        print();
        System.out.println(name+" is a part time employee and works on "+schedule+" at "+super.company);
    }
}
