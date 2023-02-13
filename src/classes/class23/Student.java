package classes.class23;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    public void study(){
        System.out.println("studying.....");
    }
    void doHomeWork(){
        System.out.println("Solving homeworks");
    }
    void practice(){
        System.out.println("practice the skills");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax Student must solve the homeworks before the next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must practice repls");
    }
}

class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College Student must practice to get good grades");
    }
}

class SchoolStudent extends Student{

}