package homeworks3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
         Write a program to find largest of three double values using if-else..if and logical operators
         provided by a user (numbers must be distinct)
         */

        Scanner scan=new Scanner(System.in);
        double a, b, c;
        System.out.println("Please Enter three numbers");
        a= scan.nextDouble();
        b= scan.nextDouble();
        c= scan.nextDouble();

        if (a>b && a>c){
            System.out.println(a+" is the largest number");
        } else if (b>a && b>c ){
            System.out.println(b+" is the largest number");
        } else if (c>a && c>b) {
            System.out.println((c+" is the largest number"));
        }


    }
}
