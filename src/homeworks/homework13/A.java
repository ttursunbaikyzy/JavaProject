package homeworks.homework13;

public class A {
    /*
    Write program to inherit class A
    that has method printF which is static
    and call or reuse that method into class B
     */

    static void printF() {
        System.out.println("Super Class A");
    }

}

class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.printF();
    }
}
