package homework.homework2;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much loan do you need?");
        int loan=input.nextInt();

        if (loan<=200000) {
            System.out.println("You're approved for a loan");
        }else{
            System.out.println("Loan is rejected");
        }

    }
}
