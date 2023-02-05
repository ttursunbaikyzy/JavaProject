package classes.class20;

public class BaseClass {
    String name="John";
    void hello (){
        System.out.println("Hello method from BaseClass");
    }

}

class Child extends BaseClass {
    String name = "Jane";

    void callMe(){
        System.out.println(name); // Jane  (by default compiler adds: this.name)
        System.out.println(super.name); // John
    }

    void hello(){
        System.out.println("Hello method from ChildClass");
    }

    void callingParentMethod () {
        hello(); // by default compiler adds: super.hello();
                // if there is only 1 hello method within parent's class and no hello method in the child class
        super.hello();

    }
}
