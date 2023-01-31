package Practice;

import homeworks.homework12.Employees;

public class EmployeesTester2 {
    public static void main(String[] args) {

        // Employees emp1 = new Employees("Sam", 33, 125000, "123456789"); << error because the constructor is private
        // Employees emp2 = new Employees("John", 45, 100000); << error because the constructor is protected
        Employees emp3 = new Employees("Melanie", 31);
        // Employees emp4 = new Employees("Jackie"); << error because the constructor is default
        // emp1.printInfo();
        // emp2.printInfo();
        emp3.printInfo();
        // emp4.printInfo();

    }
}
