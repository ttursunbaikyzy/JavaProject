package homeworks.homework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to buy");
        String item= scan.nextLine();

        System.out.println("How much does it cost");
        int price= scan.nextInt();


        while (price>0) {
            System.out.println("Please enter your payment amount");
            int money= scan.nextInt();

            price=price-money;

            if (price>0){
                System.out.println("Your remaining amount to pay is "+price);
            } else {
                System.out.println("Your change is "+price);
            }
        }
        System.out.println("Thank you for shopping");

    }
}
