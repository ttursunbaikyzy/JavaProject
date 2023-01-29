package classes.class16;

public class SyntaxEmployee {

    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    String empID;
    int salary;
    static String CEO;

    public static void main(String[] args) {
        SyntaxEmployee emp = new SyntaxEmployee();
        emp.empID="S123";
        emp.salary=75000;
        emp.CEO="Sumair";
        System.out.println("The employee ID is "+emp.empID+" and this employee's salary is "+emp.salary+" and the CEO is "+emp.CEO);

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp.empID="S456";
        emp.salary=90000;
        System.out.println("The employee ID is "+emp1.empID+" and this employee's salary is "+emp1.salary+" and the CEO is "+emp1.CEO);

    }

}
