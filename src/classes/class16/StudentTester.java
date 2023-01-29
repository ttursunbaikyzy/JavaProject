package classes.class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="Tami";
        student.id="123";
        student.schoolName="Syntax";
        student.age=18;
        student.weight=70;

        Student student1=new Student();
        student1.name="Sam";
        student1.id="456";
        // student1.schoolName="Syntax";
        student1.age=22;
        student1.weight=75;

        Student student2=new Student();
        // student2.name="Nelson";
        student2.id="789";
        // student2.schoolName="Syntax";
        student2.age=23;
        student2.weight=76;

        System.out.println(student2.name); // null value
        System.out.println(student2.schoolName); // Syntax because the value is static and shared among all objects
        System.out.println(Student.schoolName); // another way that you might see a lot to access static variables
                                                // static variables can be accessed by the object name and/or class name




    }
}
