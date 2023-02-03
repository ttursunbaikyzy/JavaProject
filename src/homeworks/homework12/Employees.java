package homeworks.homework12;

public class Employees {
    /* Task3:
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected)
    and create 4 objects of this class:
    1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.  (check Practice folder for EmployeesTester2)
     */

    String name;
    int age;
    int salary;
    String ssn;

    private Employees (String eName, int eAge, int eSalary, String eSSN){
        name=eName;
        age=eAge;
        salary=eSalary;
        ssn=eSSN;
    }

    protected Employees (String eName, int eAge, int eSalary){
        name=eName;
        age=eAge;
        salary=eSalary;
    }

    public Employees (String eName, int eAge){
        name=eName;
        age=eAge;
    }

    Employees (String eName){
        name=eName;
    }

    public void printInfo () {
            System.out.println(name + " is " + age + " years old and earns " + salary + ", and the SSN is " + ssn);
    }

    public static void main(String[] args) {
        Employees emp1 = new Employees("Sam", 33, 125000, "123456789");
        Employees emp2 = new Employees("John", 45, 100000);
        Employees emp3 = new Employees("Melanie", 31);
        Employees emp4 = new Employees("Jackie");
        emp1.printInfo();
        emp2.printInfo();
        emp3.printInfo();
        emp4.printInfo();
    }

}
