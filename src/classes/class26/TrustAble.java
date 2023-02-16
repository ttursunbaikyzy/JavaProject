package classes.class26;

public interface TrustAble {
    int age=10; // by default: public static final (a.k.a. constant)
    String color="gkgdhkz";
    int trust (); // by default: public abstract (no body)
    static void method1(){
        System.out.println("Hello world");
    }
    default void method2 () {
        System.out.println();
    }
    private void method3(){

    }
}

class Bank implements TrustAble{
    public int trust(){
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}
