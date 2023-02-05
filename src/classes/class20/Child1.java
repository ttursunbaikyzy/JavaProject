package classes.class20;

public class Child1 extends Parent {

    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye(); //accessing static method in a static way by using Parent Class name
        Child1.bye(); //accessing static method from the Parent class by using Child Class name
        // c1.money(); < has private access

        c1.name="Tami";
        Child1.lastName="Estaniss";



    }
}
