package homeworks.homework19;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.
         */

        //HashSet<Student> student=new HashSet<>();
        Set<Student> students=new HashSet<>(); // we can achieve polymorphism using type Set
        students.add(new Student("Sam","S123456789"));
        students.add(new Student("Tami","T123456789"));
        students.add(new Student("Abeera","A123456789"));
        students.add(new Student("Hiral","H123456789"));
        students.add(new Student("Wilasinee","W123456789"));

        for(Student s:students){
            System.out.println(s.getName());
        }

    }
}

class Student{
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}
