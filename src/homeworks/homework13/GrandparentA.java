package homeworks.homework13;

public class GrandparentA {
    /*
    Task 1:
    Write program for multilevel inheritance
    where class C inherits from class B
    and Class B inherits from Class A.
     */
    static void printA() {
        System.out.println("Grandparent Class A");
    }

}

class ParentB extends GrandparentA {
    static void printB() { System.out.println("Parent Class B"); }
    public static void main(String[] args) {
        ParentB b = new ParentB();
        b.printA();
    }
}

class ChildC extends ParentB{
    public static void main(String[] args) {
        ChildC c = new ChildC();
        c.printA();
        c.printB();
    }
}