package homework.homework5;

import java.util.Scanner;

public class Task3InClass {
    public static void main(String[] args) {
        /* Write a program that reads a range of integers (start and end point), provided by a user
        and then from that range prints the sum of the even and odd integers.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers for the start and end point in a range");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("start is "+start+" and end is "+end);

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i < end; i++) {
            if (i%2==0){
                evenSum+=i; // same as evenSum = evenSum + i
            } else {
                oddSum+=i;
            }
        }

        System.out.println("Sum of all the even numbers is "+evenSum);
        System.out.println("Sum of all the odd numbers is "+oddSum);

    }
}
