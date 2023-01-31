package classes.class17;

public class Student {
    /* Create a class call it Student define 4 instance fields like name, age, weight, id
    create 5 objects of this class. Do this task without constructions and with contructor
     */

    String name;
    int age;
    double weight;
    String id;

    Student(String studentName, int studentAge, double studentWeight, String studentID){
        name=studentName;
        age=studentAge;
        weight=studentWeight;
        id=studentID;
    }
    Student(String studentName, String studentID, int studentAge){
        name=studentName;
        age=studentAge;
        id=studentID;
    }

    void printInfo (){
        if (weight==0.0){
            System.out.println("Student name is " + name + ", the student ID is " + id + ", the age is " + age);
        } else {
            System.out.println("Student name is " + name + ", the student ID is " + id + ", the age is " + age + ", the weight is " + weight);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student ("Sam",25,70.5,"s123");
        Student student2 = new Student ("Hiral",22,55.1,"s456");
        Student student3 = new Student ("Rania",19,50.2,"s789");
        Student student4 = new Student ("Abeera",18,45.3,"s987");
        Student student5 = new Student ("Nelson",24,60.4,"s654");
        Student student6 = new Student ("Adem", "s321",23);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
        student5.printInfo();
        student6.printInfo();
    }


}
