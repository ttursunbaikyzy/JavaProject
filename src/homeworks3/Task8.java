package homeworks3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
        any other grade --> Not Acceptable. At the end your program should print which grade was entered
        by a user with explanation.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter grade");
        char grade= scan.next().charAt(0);

        if (grade=='A'){
            System.out.println(grade+" is Excellent");
        } else if (grade=='B'){
            System.out.println(grade+" is Good");
        } else if (grade=='C'){
            System.out.println(grade+" is Average");
        } else if (grade=='D'){
            System.out.println(grade+" is Bad");
        } else {
            System.out.println(grade+" is Not Acceptable");
        }

    }
}
