package homeworks.homework2;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age>=18) {
            System.out.println("You can apply for a drivers license");
        }else {
            System.out.println("You can apply for a learners permit");
        }
    }
}
