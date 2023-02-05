package classes.class19;

public class ThisKeyword {

    int a,b;

    ThisKeyword (int a, int b){
        this.a=a; // explicitly assigned with this keyword
        this.b=b;
    }

    public void sum(int a,int b){
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables = "+(this.a+this.b));
    }

    void hello(){
        System.out.println("hello batch 15");
    }

    void howAreYou(){
        System.out.println("How are you batch 15");
    }

    void greetings () {
        hello(); // compiler does this.hello();  --> but we don't see it, happens implicitly
                // this keyword refers to the current instance methods
        howAreYou(); // compiler does this.howAreYou();  --> but we don't see it
        // this keyword refers to the current instance methods
    }

    public static void main(String[] args) {
     ThisKeyword obj=new ThisKeyword(10,20);
        System.out.println(obj.a); // 10

        obj.sum(100,200); // 300
        // ---------------------------------
        obj.greetings();
    }

}
