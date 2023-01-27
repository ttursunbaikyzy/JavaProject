package homework.homework9;

public class Task6 {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?

        String a = "apples";
        String b = "bananas";

        System.out.println("Before swap: "+a+" and "+b);

        a=a+b;
        b = a.substring(0, a.length() -b.length() );

        a = a.substring(b.length());

        System.out.println("After swap: "+a+" and "+b);





    }
}
