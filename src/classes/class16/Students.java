package classes.class16;

public class Students {

    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students st1= new Students();
        st1.name="Tami";
        st1.studentID="S123";
        st1.numberOfStudents++;

        Students st2= new Students();
        st2.name="Sam";
        st2.studentID="S456";
        st2.numberOfStudents++;

        Students st3= new Students();
        st3.name="Abeera";
        st3.studentID="S456";
        st3.numberOfStudents++;

        System.out.println("Total number of students is "+Students.numberOfStudents);
    }

}
