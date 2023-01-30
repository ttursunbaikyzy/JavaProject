package homeworks.homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= scan.next();

        switch (country){

            case "USA":
                System.out.println("English");
                break;
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "Greece":
                System.out.println("Greek");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            default:
                System.out.println("Wrong country");
        }

    }
}
