package homeworks.homework13;

public class Teacher {
    /* Task 2:
    Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour.
    Test all 4 classes
     */

    String name;
    int teacherId;
    String subject;
    int age;

    void printName(){
        System.out.println("Teacher name: "+name);
    }

    void printID(){
        System.out.println("The teacher ID is "+teacherId);
    }
    void printSubject(){
        System.out.println(name+" teaches "+subject);
    }
    void printAge(){
        System.out.println(name+" is "+age+" years old");
    }

}

class MathTeacher extends Teacher{
    int salary;
    void printSalary(){
        System.out.println(name+" earns "+salary+" for a year");
    }
}

class ChemistryTeacher extends Teacher {
    String schedule;
    void printSchedule(){
        System.out.println(name+" teaches classes on "+schedule);
    }
}

class PianoTeacher extends Teacher{
    String hobby;
    void favoriteHobby(){
        System.out.println(name+" loves music");
    }
}