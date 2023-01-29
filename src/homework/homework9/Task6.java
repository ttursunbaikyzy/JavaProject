package homework.homework9;

public class Task6 {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?

        String a = "apples"; //6
        String b = "bananas"; //7

        System.out.println("Before swap: "+a+" and "+b);

        a=a+b; //13 applesbananas
        b = a.substring(0, a.length() -b.length() ); //a p p l e s

        a = a.substring(b.length()); // b a n a n a s

        System.out.println("After swap: "+a+" and "+b);





    }
}
