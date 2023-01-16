package homework.homework2;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card");
        String creditCard = input.nextLine();

        if (creditCard.equals("yes")) {
            System.out.println("What is the balance on the card");
            int balance = input.nextInt();
            if (balance>1000){
                System.out.println("Please pay off the balance immediately");
            }else{
                System.out.println("You can spend more");
            }
        }else{
            System.out.println("You should get a credit card");
        }
    }
}
