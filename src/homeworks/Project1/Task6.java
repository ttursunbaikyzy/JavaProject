package homeworks.Project1;

public class Task6 {
    public static void main(String[] args) {

        // Write a program to swap 2 numbers without a temporary variable?

        int a = 10;
        int b = 20;

        System.out.println("Before the swap, the first number is "+a+" and the second number is "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After the swap, the first number is "+a+" and the second number is "+b);

    }
}
