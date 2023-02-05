package homeworks.homework14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp=new Employee("Sam","S123");
        emp.printInfo();
        emp.print();

        System.out.println();
        FullTime ft = new FullTime("Nickou","N123","11/1/2022");
        ft.printInfo();
        ft.printStartDate();

        System.out.println();
        PartTime pt = new PartTime("Tami","T123","Fridays");
        pt.printInfo();
        pt.printSchedule();
    }
}
