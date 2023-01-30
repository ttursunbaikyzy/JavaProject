package homeworks.homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Write a program that reads a range of integers (start and end point), provided by a user
        and then from that range prints the sum of the even and odd integers.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers for the start and end point in a range");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sumEven=0;
        int sumOdd=0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sumEven=sumEven+i;
            }
        }
        System.out.println(sumEven);

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sumOdd=sumOdd+i;
            }
        }
        System.out.println(sumOdd);

    }
}
